package org.example.generating_patterns.prototyp;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super Project", "SourceCode sourceCode = new SourceCode();\n");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();

        System.out.println("\n=======================\n");
        System.out.println(masterClone);




    }
}
