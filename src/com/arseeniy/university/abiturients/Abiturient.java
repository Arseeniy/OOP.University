package com.arseeniy.university.abiturients;


import java.util.ArrayList;
import java.util.List;

public class Abiturient {
    private String name;
    private AbiturientMarks abiturientMarks;

    private static List<Abiturient> abiturientsList = new ArrayList<>();

    public Abiturient(String name, AbiturientMarks abiturientMarks) {
        this.abiturientMarks = abiturientMarks;
        this.name = name;
        abiturientsList.add(this);
    }

    public AbiturientMarks getAbiturientMarks() {
        return abiturientMarks;
    }

    public void setAbiturientMarks(AbiturientMarks abiturientMarks) {
        this.abiturientMarks = abiturientMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Abiturient> getAbiturientsList() {
        return abiturientsList;
    }
}
