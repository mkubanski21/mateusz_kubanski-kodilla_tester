package com.kodilla.jacoco;

public class Year {
    int checkYear;

    public Year(int checkYear) {
        this.checkYear = checkYear;
    }

    public boolean isLeap() {
        if (this.checkYear % 4 == 0) {
            if (this.checkYear % 100 == 0) {
                if (this.checkYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}