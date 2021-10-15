public class User {
    private String name;
    private int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }

    public static void main (String [] Args) {
        User adam = new User("Adam", 20);
        User piotr = new User("Piotr", 26);
        User marek = new User("Marek", 36);
        User marta = new User("Marta", 40);
        User anna = new User("Anna", 19);
        User[] users = {adam, piotr, marek, marta, anna};

        int sum = 0;
        float avg = 0;

        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }
        avg = (float) sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < avg) {
                System.out.println(users[i].name);
            }
        }
    }
}
