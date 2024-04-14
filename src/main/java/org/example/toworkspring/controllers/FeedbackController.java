package org.example.toworkspring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Feedback;
import org.example.toworkspring.models.Feedbackitem;
import org.example.toworkspring.services.FeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class FeedbackController {
    private final FeedbackService feedbackService;

    @GetMapping("/feedbacks")
    public ArrayList<Feedback> getSurveys() {
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/getFeedbacksItemsById")
    public ArrayList<Feedbackitem> getFeedbackItemsById(@RequestParam(value = "idFeedback", defaultValue = "1") Integer idFeedback) {
        return feedbackService.getAllFeedbackItems(idFeedback);
    }
}
