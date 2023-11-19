package org.example.structural_patterrns.bridge;

import org.example.generating_patterns.fabricMethod.Developer;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer){
        this.developer = developer;
    }

    abstract  void developProgram();
}
