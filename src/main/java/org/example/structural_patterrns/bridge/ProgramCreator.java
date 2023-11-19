package org.example.structural_patterrns.bridge;

import org.example.generating_patterns.fabricMethod.CppDeveloper;
import org.example.generating_patterns.fabricMethod.JavaDeveloper;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankingSystem(new JavaDeveloper()),
                new StokeExchange(new CppDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }
    }
}
