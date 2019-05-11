package com.example.mvctries.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import java.io.IOException;

/**
 * The deserialization logic is in fact the one provided by jackson,
 * I only added the logic for gathering and storing the binding errors.
 */
public class CustomIntegerDeserializer extends StdDeserializer<Integer> {
	private final static NumberDeserializers.IntegerDeserializer wrapperInstance =
			new NumberDeserializers.IntegerDeserializer(Integer.class, null);

	public CustomIntegerDeserializer() {
		this(null);
	}

	private CustomIntegerDeserializer(Class<?> vc) {
		super(vc);
	}

	/**
	 * Jackson based deserialization logic.
	 */
	@Override
	public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		try {
			return wrapperInstance.deserialize(p, ctxt);
		} catch (InvalidFormatException ex) {
			gatherBindingErrors(p, ctxt);
		}
		return null;
	}

	/*
	 * The logic gathering the binding errors.
	 */
	private void gatherBindingErrors(JsonParser p, DeserializationContext ctxt) throws IOException {
		String parent = computeParentPath(ctxt.getParser().getParsingContext(), new StringBuilder()).toString();
		DeserializersState.ERRORS.get().put(parent + p.getCurrentName(), p.getText());
	}

	private StringBuilder computeParentPath(JsonStreamContext parserCtxt, StringBuilder sb) {
		JsonStreamContext parentCtxt = parserCtxt.getParent();
		if (parentCtxt.getCurrentName() == null) {
			return sb;
		}
		sb.insert(0, parentCtxt.getCurrentName() + '.');
		return computeParentPath(parentCtxt, sb);
	}
}
