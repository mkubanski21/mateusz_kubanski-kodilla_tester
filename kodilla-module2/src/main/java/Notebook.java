public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if(this.weight <= 1800) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkPriceAndYear() {
        if (this.price > 1000 && this.year < 2017) {
            System.out.println("This notebook is expensive and old.");
        } else if (this.price < 800 && this.year < 2019 && this.year >= 2017) {
            System.out.println("This notebook is cheap and not so old.");
        } else if (this.price <= 1000 && this.year >= 2020) {
            System.out.println("This notebook is not so expensive and almost new.");
        } else {
            System.out.println("No category for these data");
        }
    }
}
