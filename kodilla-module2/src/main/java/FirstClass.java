public class FirstClass {
    public static void main (String [] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println("Weight:" + notebook.weight + " Price:" + notebook.price + " Year:" + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkPriceAndYear();
        System.out.println();

        Notebook oldNotebook = new Notebook(2000, 1500, 2015);
        System.out.println("Weight:" + oldNotebook.weight + " Price:" + oldNotebook.price + " Year:" + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkPriceAndYear();
        System.out.println();

        Notebook heavyNotebook = new Notebook(1600, 500, 2018);
        System.out.println("Weight:" + heavyNotebook.weight + " Price:" + heavyNotebook.price + " Year:" + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkPriceAndYear();
    }
}

