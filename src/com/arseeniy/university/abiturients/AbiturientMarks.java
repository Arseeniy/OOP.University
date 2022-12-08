package com.arseeniy.university.abiturients;

import java.util.List;

public class AbiturientMarks {

    private int[] abiturientMarksArray = new int[5];


    public AbiturientMarks(int[] abiturientMarksArray) {
        this.abiturientMarksArray = abiturientMarksArray;
    }

    public int[] getAbiturientMarksArray() {
        return abiturientMarksArray;
    }

    public void setAbiturientMarksArray(int[] abiturientMarksArray) {
        this.abiturientMarksArray = abiturientMarksArray;
    }
}
