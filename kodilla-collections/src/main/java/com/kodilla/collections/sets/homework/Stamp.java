package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double width;
    private double height;
    private boolean isMarked;

    public Stamp(String stampName, double width, double height, boolean isMarked) {
        this.stampName = stampName;
        this.width = width;
        this.height = height;
        this.isMarked = isMarked;
    }

    public String getStampName() {
        return stampName;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarked() {
        return isMarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return width == stamp.width && height == stamp.height && isMarked == stamp.isMarked && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, width, height, isMarked);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isMarked=" + isMarked +
                '}';
    }
}
