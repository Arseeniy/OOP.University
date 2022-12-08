package com.arseeniy.university.service.examinationservice;

import com.arseeniy.university.abiturients.Abiturient;

import java.util.List;

public interface ExaminationService {
    public List<Abiturient> getListEnrolledAbiturients(List<Abiturient> abiturientList);

    public int getAverageStudentMark(int[] studentMarkArray);
}
