package com.kovalenkovolodymyr.adapter.impl;

import com.kovalenkovolodymyr.adapter.ISeniorDeveloper;

public class SeniorDeveloper implements ISeniorDeveloper {
    private int knowledgeLevel;
    private int motivationLevel;

    public SeniorDeveloper() {
        knowledgeLevel = DEFAULT_SENIOR_KNOWLEDGE_LEVEL;
        motivationLevel = DEFAULT_SENIOR_MOTIVATION_LEVEL;
    }

    public SeniorDeveloper(Student student){
        knowledgeLevel = student.getKnowledgeLevel();
        motivationLevel = student.getMotivationLevel();
    }

    @Override
    public void workOnProject() {
        knowledgeLevel += 5;
        System.out.println("Working on project");
    }

    @Override
    public void releaseProject() {
        knowledgeLevel += 10;
        System.out.println("I successfully released a project");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Drink a coffee");
    }

    @Override
    public void teamBuiling() {
        motivationLevel += 10;
        System.out.println("Go to pub with beloved team members.");
    }
}
