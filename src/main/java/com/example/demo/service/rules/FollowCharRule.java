package com.example.demo.service.rules;

import com.example.demo.interfaces.ValidateRule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class FollowCharRule implements ValidateRule {
    private final Map<Character, List<Character>> allowedFollowChar;

    @Override
    public boolean isValid(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            List<Character> allowedChars = allowedFollowChar.get(currentChar);
            if (allowedChars == null || !allowedChars.contains(nextChar)) {
                return false;
            }
        }
        return true;
    }
}
