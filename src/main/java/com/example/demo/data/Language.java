package com.example.demo.data;

import com.example.demo.interfaces.ValidateRule;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Language {
    String languageName;
    List<ValidateRule> rules;

    public boolean isValid(String word) {
        for (var rule : rules) {
            boolean result = rule.isValid(word);

            if (!result) {
                return false;
            }
        }

        return true;
    }
}
