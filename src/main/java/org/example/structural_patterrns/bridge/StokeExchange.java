package org.example.structural_patterrns.bridge;

import org.example.generating_patterns.fabricMethod.Developer;

public class StokeExchange extends Program{
    public StokeExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stoke Exchange Development in Progress...");
        developer.writeCod();
    }
}
