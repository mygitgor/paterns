package org.example.generating_patterns.abstractFabicMethd.websiteProject;

import org.example.generating_patterns.abstractFabicMethd.Developer;
import org.example.generating_patterns.abstractFabicMethd.ProjectManager;
import org.example.generating_patterns.abstractFabicMethd.ProjectTeamFactory;
import org.example.generating_patterns.abstractFabicMethd.Tester;

public class WebsiteTemFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
