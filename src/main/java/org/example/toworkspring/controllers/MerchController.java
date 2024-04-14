package org.example.toworkspring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Merch;
import org.example.toworkspring.services.MerchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class MerchController {
    private final MerchService merchService;

    @GetMapping("/merch")
    public ArrayList<Merch> getAllMerch() {
        System.out.println(merchService.getAllMerch());
        return merchService.getAllMerch();
    }
}
