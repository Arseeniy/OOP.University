package com.arseeniy.university.service.demoservice;

import com.arseeniy.university.abiturients.Abiturient;
import com.arseeniy.university.abiturients.AbiturientMarks;
import com.arseeniy.university.service.examinationservice.ExaminationServiceImpl;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private static ExaminationServiceImpl examinationService = new ExaminationServiceImpl();

    public static void startTest() {
        Abiturient abiturient1 = new Abiturient("Ivan", new AbiturientMarks(new int[]{4, 3, 5, 4, 3}));
        Abiturient abiturient2 = new Abiturient("Oleg", new AbiturientMarks(new int[]{3, 5, 5, 4, 3}));
        Abiturient abiturient3 = new Abiturient("Natalia", new AbiturientMarks(new int[]{4, 3, 2, 4, 3}));
        Abiturient abiturient4 = new Abiturient("Dmitriy", new AbiturientMarks(new int[]{5, 5, 5, 4, 3}));
        Abiturient abiturient5 = new Abiturient("Aleksandra", new AbiturientMarks(new int[]{2, 3, 5, 4, 2}));
        System.out.println(Abiturient.getAbiturientsList());
        List<Abiturient> toConsole = examinationService.getListEnrolledAbiturients(Abiturient.getAbiturientsList());
        for (Abiturient abiturient : toConsole) {
            System.out.println(abiturient.getName() + examinationService.getAverageStudentMark(abiturient.getAbiturientMarks().getAbiturientMarksArray()));
        }
    }
}
