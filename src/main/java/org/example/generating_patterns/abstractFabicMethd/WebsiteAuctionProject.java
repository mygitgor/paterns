package org.example.generating_patterns.abstractFabicMethd;

import org.example.generating_patterns.abstractFabicMethd.websiteProject.WebsiteTemFactory;

public class WebsiteAuctionProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTemFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("create website tem");
        developer.writeCod();
        tester.testCod();
        projectManager.manageProject();
    }
}
