package com.fatihpy.Composite;

public class Main {


    public static void main(String[] args) {
        TaskComponent root = new Task("Bilpay");

        TaskComponent requirementsEngineering = new Task("Requirements Engineering");
        requirementsEngineering.addTask(new TaskItem("Requirements Specification", 5));
        requirementsEngineering.addTask(new TaskItem("Requirements Elicitation and Analysis", 8));
        requirementsEngineering.addTask(new TaskItem("Requirements Validation", 4));

        root.addTask(requirementsEngineering);

        TaskComponent research = new Task("Research, Analysis and Training");
        TaskComponent analysis = new Task("Analyzing Blockchain Technologies");
        analysis.addTask(new TaskItem("Analyzing Hyperledger", 4));
        analysis.addTask(new TaskItem("Analyzing Fabric", 3));
        research.addTask(analysis);
        research.addTask(new TaskItem("Blockchain Training", 14));

        root.addTask(research);

        root.print();
    }
}
