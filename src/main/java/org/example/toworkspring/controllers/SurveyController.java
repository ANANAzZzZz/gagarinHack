package org.example.toworkspring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Survey;
import org.example.toworkspring.services.SurveyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/surveys")
    public ArrayList<Survey> getAllAchievement() {
        return surveyService.getAllSurveys();
    }

}
