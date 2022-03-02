package com.codedifferently.labs.lab25.partA.example03;

import java.util.ArrayList;

public class StudentRoster {
    private ArrayList<String> studentNames;

    public StudentRoster(){
        studentNames = new ArrayList<>();
    }

    public void addStudent(String name){
        studentNames.add(name);
    }

    public String displayStudents(){
        StringBuilder builder = new StringBuilder();
        for(String student:studentNames){
            builder.append("Student name: " + student + "\n");
        }
        return builder.toString().trim();
    }
}
