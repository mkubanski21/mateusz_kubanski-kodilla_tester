public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAge() {
        if (this.name != null) {
            if (this.age > 50) {
                System.out.println("User is older than 50.");
            } else if (this.age > 30) {
                System.out.println("User is older than 30 and equal or younger than 50.)");
            } else {
                System.out.println("User is equal and younger than 30.");
            }
        } else {
            System.out.println("No name specified.");
        }
    }
    public void checkHeight() {
        if (this.name != null) {
            if (this.height > 180) {
                System.out.println("User is taller than 180 cm.");
            } else if (this.height > 160) {
                System.out.println("User is taller than 160 and equal or lower than 180 cm.");
            } else {
                System.out.println("User is equal and lower than 160 cm.");
            }
        } else {
            System.out.println("No name specified.");
        }
    }
}
