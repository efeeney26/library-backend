package com.example.demo.payload;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class ResponsePayload {
    private String message;

    public Map<String, String> getPayload() {
        Map<String, String> payload = new HashMap<>();
        payload.put("message", this.message);
        return payload;
    }
}
