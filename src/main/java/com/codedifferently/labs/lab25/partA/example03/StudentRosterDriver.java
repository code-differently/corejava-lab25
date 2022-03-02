package com.codedifferently.labs.lab25.partA.example03;

public class StudentRosterDriver {
    public static void main(String[] args) {
        StudentRoster roster = new StudentRoster();
        roster.addStudent("James Earl Jones");
        roster.addStudent("Tom Cruise");
        roster.addStudent("Flex ArmStrong");
        String output = roster.displayStudents();
        System.out.println(output);
    }
}
