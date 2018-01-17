package com.kovalenkovolodymyr.adapter;

public interface IStudent {
    int DEFAULT_STUDENT_KNOWLEDGE_LEVEL = 5;
    int DEFAULT_STUDENT_MOTIVATION_LEVEL = 10;

    void studyHard();
    void passExam();
    void sleep();
    void haveParty();
}
