package com.leonardo.creditanalysisapp.service.strategy.impl;

import java.util.Random;

import com.leonardo.creditanalysisapp.domain.Proposal;
import com.leonardo.creditanalysisapp.service.strategy.IPointCalc;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OtherLoansImpl implements IPointCalc {
    private final Random random;

    @Override
    public int calc(Proposal proposal) {
        return otherLoans() ? -80 : 0;
    }

    public boolean otherLoans() {
        return random.nextBoolean();
    }
}
