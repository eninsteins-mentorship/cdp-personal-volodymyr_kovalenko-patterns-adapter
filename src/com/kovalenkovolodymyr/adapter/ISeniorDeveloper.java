package com.kovalenkovolodymyr.adapter;

public interface ISeniorDeveloper {
    int DEFAULT_SENIOR_KNOWLEDGE_LEVEL = 20;
    int DEFAULT_SENIOR_MOTIVATION_LEVEL = 30;

    void workOnProject();
    void releaseProject();
    void drinkCoffee();
    void teamBuiling();
}
