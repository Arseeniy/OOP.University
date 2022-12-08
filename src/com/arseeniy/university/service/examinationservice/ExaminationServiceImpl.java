package com.arseeniy.university.service.examinationservice;

import com.arseeniy.university.abiturients.Abiturient;

import java.util.*;

public class ExaminationServiceImpl implements ExaminationService {

    private static final Integer availableCount = 3;

    @Override
    public List<Abiturient> getListEnrolledAbiturients(List<Abiturient> abiturientList) {
        List<Abiturient> finalList = new ArrayList<>();
        Map<Abiturient, Integer> abiturientMap = new HashMap<>();
        for (Abiturient abiturient: abiturientList){
            abiturientMap.put(abiturient, getAverageStudentMark(abiturient.getAbiturientMarks().getAbiturientMarksArray()));
        }
        Map<Abiturient, Integer> finalMap = sortByComparator(abiturientMap, false);
        Iterator<Map.Entry<Abiturient, Integer>> iterator = finalMap.entrySet().iterator();
        for (int i = 0; i < availableCount; i++) {
            Map.Entry<Abiturient, Integer> entry = iterator.next();
            finalList.add(entry.getKey());
        }
        return finalList;
    }

    @Override
    public int getAverageStudentMark(int[] studentMarkArray) {
        int sum = 0;
        for (Integer mark : studentMarkArray) {
            sum += mark;
        }
        return sum / studentMarkArray.length;
    }

    private static Map<Abiturient, Integer> sortByComparator(Map<Abiturient, Integer> unsortMap, final boolean order) {

        List<Map.Entry<Abiturient, Integer>> list = new LinkedList<Map.Entry<Abiturient, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Abiturient, Integer>>()
        {
            public int compare(Map.Entry<Abiturient, Integer> o1,
                               Map.Entry<Abiturient, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        Map<Abiturient, Integer> sortedMap = new LinkedHashMap<Abiturient, Integer>();
        for (Map.Entry<Abiturient, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

