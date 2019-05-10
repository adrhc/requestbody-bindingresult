package com.example.mvctries.json.deserializer;

import java.util.HashMap;
import java.util.Map;

public class DeserializersState {
	public static final ThreadLocal<Map<String, String>> ERRORS = ThreadLocal.withInitial(HashMap::new);
}
