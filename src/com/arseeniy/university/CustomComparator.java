package com.arseeniy.university;

import com.arseeniy.university.abiturients.Abiturient;
import com.arseeniy.university.service.examinationservice.ExaminationServiceImpl;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CustomComparator implements Comparator<Abiturient> {

    private ExaminationServiceImpl examinationService;

    @Override
    public int compare(Abiturient o1, Abiturient o2) {

        return 0;
    }

}
