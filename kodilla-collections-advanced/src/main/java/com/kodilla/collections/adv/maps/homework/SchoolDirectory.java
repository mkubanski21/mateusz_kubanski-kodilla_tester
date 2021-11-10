package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal kowalski = new Principal("Adam", "Kowalski");
        Principal nowak = new Principal("Piotr", "Nowak");
        Principal kowalewski = new Principal("Marek", "Kowalewski");
        School highSchoolNumber2 = new School("High School number 2", 22, 23, 16, 38, 20);
        School highSchoolNumber4 = new School("High School number 4", 15, 33, 16, 18, 20, 19);
        School highSchoolNumber7 = new School("High School number 7", 22, 23, 25, 38, 20, 25, 25);

        schoolDirectory.put(kowalski, highSchoolNumber2);
        schoolDirectory.put(nowak, highSchoolNumber4);
        schoolDirectory.put(kowalewski, highSchoolNumber7);

        for (Map.Entry<Principal, School> schoolEntry : schoolDirectory.entrySet())
            System.out.println("Principal: " + schoolEntry.getKey().getFirstName() + " " + schoolEntry.getKey().getLastName()
                    + ", school name: " + schoolEntry.getValue().getSchoolName() + ", total number of students: "
                    + schoolEntry.getValue().getOverallNumberOfStudents());
    }
}
