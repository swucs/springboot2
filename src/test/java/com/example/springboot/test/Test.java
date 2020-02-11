package com.example.springboot.test;

import com.example.springboot.config.auth.dto.OAuthAttributes;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("name", "test");

        OAuthAttributes test = OAuthAttributes.of("Test", "TEst", attributes);
        System.out.println(test.hashCode());

        OAuthAttributes test2 = OAuthAttributes.of("Test", "TEst", attributes);
        System.out.println(test2.hashCode());

    }
}
