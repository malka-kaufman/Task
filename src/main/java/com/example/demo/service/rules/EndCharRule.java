package com.example.demo.service.rules;

import com.example.demo.interfaces.ValidateRule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EndCharRule implements ValidateRule {
    private final List<Character> allowedEndChar;

    @Override
    public boolean isValid(String str) {
        return allowedEndChar.contains(str.charAt(str.length() - 1));
    }
}
