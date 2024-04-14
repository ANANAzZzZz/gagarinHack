package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Sureveyitem;
import org.example.toworkspring.models.Survey;
import org.example.toworkspring.repositories.SureveyItemRepository;
import org.example.toworkspring.repositories.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor

public class SurveyService {
    private final SurveyRepository surveyRepository;
    private final SureveyItemRepository sureveyItemRepository;


    public ArrayList<Survey> getAllSurveys() {
        return (ArrayList<Survey>) surveyRepository.findAll();
    }

    public ArrayList<Sureveyitem> getAllSurveyitems(Integer idSurvey) {
        return (ArrayList<Sureveyitem>) sureveyItemRepository.findAllByIdEquals(idSurvey);
    }

}
