package com.example.mvctries.json.deserializer;

import java.util.HashMap;
import java.util.Map;

public class JsonParsingFeedBack {
	public static final ThreadLocal<Map<String, String>> ERRORS = ThreadLocal.withInitial(HashMap::new);
}
