package com.example.urlshortener.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UrlController {

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String originalUrl) {
        return "http://short.ly/abc123"; // mock response
    }

    @GetMapping("/{shortCode}")
    public String redirectToOriginal(@PathVariable String shortCode) {
        return "https://original-url.com"; // mock response
    }
}
