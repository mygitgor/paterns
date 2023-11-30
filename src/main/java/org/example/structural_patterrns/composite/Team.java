package org.example.structural_patterrns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Create project...\n");
        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
