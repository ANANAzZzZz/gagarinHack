package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.repositories.MerchRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class MerchService {
    private final MerchRepository merchRepository;
    public ArrayList<Achievement> getAllMerch() {
        return (ArrayList<Achievement>) merchRepository.findAll();
    }
}
