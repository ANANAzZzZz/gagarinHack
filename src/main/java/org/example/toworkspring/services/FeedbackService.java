package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Feedback;
import org.example.toworkspring.models.Feedbackitem;
import org.example.toworkspring.repositories.FeedbackItemRepository;
import org.example.toworkspring.repositories.FeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor

public class FeedbackService {
    private final FeedbackRepository feedbackRepository;
    private final FeedbackItemRepository feedbackItemRepository;

    public ArrayList<Feedback> getAllFeedbacks() {
        return (ArrayList<Feedback>) feedbackRepository.findAll();
    }

    public ArrayList<Feedbackitem> getAllFeedbackItems(Integer idFeedback) {
        return feedbackItemRepository.findAllByIdEquals(idFeedback);
    }
}