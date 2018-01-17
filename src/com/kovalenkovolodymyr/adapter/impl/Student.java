package com.kovalenkovolodymyr.adapter.impl;

import com.kovalenkovolodymyr.adapter.IStudent;

public class Student implements IStudent {
    private int knowledgeLevel;
    private int motivationLevel;

    public Student() {
        knowledgeLevel = DEFAULT_STUDENT_KNOWLEDGE_LEVEL;
        motivationLevel = DEFAULT_STUDENT_MOTIVATION_LEVEL;
    }

    @Override
    public void studyHard() {
        knowledgeLevel++;
        System.out.println("I'm learning a lot of new information.");
    }

    @Override
    public void passExam() {
        knowledgeLevel++;
        motivationLevel += 2;
        System.out.println("I successfully pass my exams.");
    }

    @Override
    public void sleep() {
        motivationLevel++;
        System.out.println("I need a lot of rest to prepare myself for another day.");
    }

    @Override
    public void haveParty() {
        motivationLevel += 2;
        knowledgeLevel--;
        System.out.println("Yay, will have fun tonight ♪┏(・o・)┛ ♪ ┗ ( ・o・) ┓♪");
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public int getMotivationLevel() {
        return motivationLevel;
    }
}