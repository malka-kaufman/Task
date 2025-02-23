package com.example.demo.service;

import com.example.demo.data.Language;
import com.example.demo.service.rules.EndCharRule;
import com.example.demo.service.rules.FollowCharRule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ValidateLanguage {
    List<Language> languages = new ArrayList<>();

    public ValidateLanguage() {
        languages.add(Language.builder()
                .languageName("language 1")
                .rules(List.of(
                        new EndCharRule(List.of('a', 'c')),
                        new FollowCharRule(Map.of('a', List.of('a', 'b', 'd'),
                                'b', List.of('a', 'f'),
                                'c', List.of('a')))))
                .build());

        languages.add(Language.builder()
                .languageName("language 1")
                .rules(List.of(
                        new EndCharRule(List.of('b', 'b'))))
                .build());
    }

    public boolean isValid(String languageName, String word) {
        Language language = languages.stream()
                .filter(l -> l.getLanguageName().equals(languageName))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Language not found"));

        return language.isValid(word);
    }
}
