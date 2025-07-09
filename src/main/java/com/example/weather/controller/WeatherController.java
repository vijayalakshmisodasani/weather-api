package com.example.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather")
    public String getWeather() {
        return "It's sunny today!";
    }
}
