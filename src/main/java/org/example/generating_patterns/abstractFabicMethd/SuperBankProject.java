package org.example.generating_patterns.abstractFabicMethd;

import org.example.generating_patterns.abstractFabicMethd.bankProject.BankingThemFactory;

public class SuperBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingThemFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("creating them");

        developer.writeCod();
        tester.testCod();
        projectManager.manageProject();
    }
}
