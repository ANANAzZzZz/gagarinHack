package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Discount;
import org.example.toworkspring.repositories.DiscountRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class DiscountService {
    private final DiscountRepository discountRepository;

    public ArrayList<Discount> getAllDiscount() {
        return (ArrayList<Discount>) discountRepository.findAll();
    }
}
