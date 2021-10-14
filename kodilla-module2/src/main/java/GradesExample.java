public class GradesExample {
    public static void main(String [] Args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(4);
        grades.add(6);
        grades.add(5);
        grades.add(3);
        grades.add(5);
        System.out.println(grades.newestGrade());
        System.out.println(grades.average());
    }
}
