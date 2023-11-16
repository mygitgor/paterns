package org.example.generating_patterns.fabricMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        DeveloperFactory developerFactory = createDeveloperSpecialist("cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCod();

    }
//    static  DeveloperFactory createDeveloperSpecialist(String specialist){
//        if(specialist.equalsIgnoreCase("java")){
//            return  new JavaDeveloperFactory();
//        } else if (specialist.equalsIgnoreCase("cpp")) {
//            return new CppDeveloperFactory();
//        }else{
//            throw new RuntimeException(specialist+"i dont now");
//        }
//    }
}
