package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Merch;
import org.example.toworkspring.repositories.MerchRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class MerchService {
    private final MerchRepository merchRepository;

    public ArrayList<Merch> getAllMerch() {
        return (ArrayList<Merch>) merchRepository.findAll();
    }
}
