package com.kovalenkovolodymyr;

import com.kovalenkovolodymyr.adapter.ISeniorDeveloper;
import com.kovalenkovolodymyr.adapter.impl.SeniorDeveloper;
import com.kovalenkovolodymyr.adapter.impl.Student;
import com.kovalenkovolodymyr.adapter.impl.StudentToSeniorDeveloperAdapter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Story of one student.");
        waitForUserEnter();
        System.out.println("Far far away was student");
        waitForUserEnter();
        Student student = new Student();
        System.out.println("And his dream was to be a senior developer.");
        waitForUserEnter();
        System.out.println("And he started learning tons of information");
        waitForUserEnter();
        while (student.getKnowledgeLevel() < ISeniorDeveloper.DEFAULT_SENIOR_KNOWLEDGE_LEVEL
                && student.getMotivationLevel() < ISeniorDeveloper.DEFAULT_SENIOR_MOTIVATION_LEVEL) {
            student.studyHard();
            student.sleep();
            student.passExam();
            student.haveParty();
            waitForUserEnter();
        }
        System.out.println("And he finally become a senior developer");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(student);
        seniorDeveloper.workOnProject();
        seniorDeveloper.drinkCoffee();
        seniorDeveloper.teamBuiling();
        seniorDeveloper.releaseProject();
        waitForUserEnter();
        System.out.println("But legends say there is student in every senior developer's soul");
        waitForUserEnter();
        StudentToSeniorDeveloperAdapter adapter = new StudentToSeniorDeveloperAdapter(student);
        adapter.drinkCoffee();
        adapter.releaseProject();
        adapter.workOnProject();
        adapter.teamBuiling();
    }

    // Wait for user input (enter)
    private static void waitForUserEnter() throws IOException {
        System.in.read();
    }
}
