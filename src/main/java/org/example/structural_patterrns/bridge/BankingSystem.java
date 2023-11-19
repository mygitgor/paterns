package org.example.structural_patterrns.bridge;

import org.example.generating_patterns.fabricMethod.Developer;

public class BankingSystem extends Program {
    public BankingSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank System Development in Progress...");
        developer.writeCod();
    }
}
