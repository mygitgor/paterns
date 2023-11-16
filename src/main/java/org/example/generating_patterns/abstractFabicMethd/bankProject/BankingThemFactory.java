package org.example.generating_patterns.abstractFabicMethd.bankProject;

import org.example.generating_patterns.abstractFabicMethd.Developer;
import org.example.generating_patterns.abstractFabicMethd.ProjectManager;
import org.example.generating_patterns.abstractFabicMethd.ProjectTeamFactory;
import org.example.generating_patterns.abstractFabicMethd.Tester;

public class BankingThemFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QAtester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PManager();
    }
}
