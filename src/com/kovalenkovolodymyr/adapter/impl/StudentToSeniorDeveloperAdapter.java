package com.kovalenkovolodymyr.adapter.impl;

import com.kovalenkovolodymyr.adapter.ISeniorDeveloper;

public class StudentToSeniorDeveloperAdapter implements ISeniorDeveloper {
    private Student student;

    public StudentToSeniorDeveloperAdapter(Student student){
        this.student = student;
    }

    @Override
    public void workOnProject() {
        student.studyHard();
    }

    @Override
    public void releaseProject() {
        student.passExam();
    }

    @Override
    public void drinkCoffee() {
        student.sleep();
    }

    @Override
    public void teamBuiling() {
        student.haveParty();
    }
}
