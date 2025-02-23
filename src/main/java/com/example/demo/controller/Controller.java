package com.example.demo.controller;

import com.example.demo.service.ValidateLanguage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/language")
@AllArgsConstructor
public class Controller {
    private final ValidateLanguage validateLanguage;

    @GetMapping("/{languageName}")
    public boolean isValid(@PathVariable String languageName, @RequestParam String word) {
        return validateLanguage.isValid(languageName, word);
    }
}
