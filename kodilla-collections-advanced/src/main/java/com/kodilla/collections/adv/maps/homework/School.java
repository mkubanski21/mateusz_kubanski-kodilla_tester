package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();
    private String schoolName;

    public School (String schoolName, int...numberOfStudents) {
       this.schoolName = schoolName;
       for(int number : numberOfStudents)
           this.numberOfStudents.add(number);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getOverallNumberOfStudents() {
        int sum = 0;
        for(int i = 0; i < this.numberOfStudents.size(); i++)
            sum += this.numberOfStudents.get(i);
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
