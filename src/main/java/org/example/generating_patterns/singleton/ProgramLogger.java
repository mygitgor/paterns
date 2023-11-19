package org.example.generating_patterns.singleton;

public class ProgramLogger {
    private static  ProgramLogger programLogger;
    private static  String logFile = "This is logFile. \n\n";

    public  static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return  programLogger;
    }

    private  ProgramLogger(){}

    public  void addLogInfo(String loInfo){
        logFile += loInfo + "\n";
    }

    public  void showFile(){
        System.out.println(logFile);
    }
}
