package com.example.mvctries.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import java.io.IOException;

public class CustomIntegerDeserializer extends StdDeserializer<Integer> {
	private final static NumberDeserializers.IntegerDeserializer wrapperInstance =
			new NumberDeserializers.IntegerDeserializer(Integer.class, null);

	public CustomIntegerDeserializer() {
		this(null);
	}

	private CustomIntegerDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		try {
			return wrapperInstance.deserialize(p, ctxt);
		} catch (InvalidFormatException ex) {
			DeserializersState.ERRORS.get().put(p.getCurrentName(), p.getText());
		}
		return null;
	}
}
