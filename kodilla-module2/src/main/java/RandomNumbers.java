import java.util.Random;
import java.util.ArrayList;

public class RandomNumbers {
    private ArrayList<Integer> values = new ArrayList<>();

    public RandomNumbers() {
        this.values = values;
    }

    public ArrayList<Integer> numbers() {
        Random random = new Random();
        int sum = 0;
        while (sum <= 5000) {
            int value = random.nextInt(31);
            sum += value;
            this.values.add(value);
        }
        return values;
    }
    public int getMax() {
        int maxValue = 0;
        for (int i = 0; i < this.values.size(); i++) {
            if (this.values.get(i) > maxValue) {
                maxValue = this.values.get(i);
            }
        }
        return maxValue;
    }
    public int getMin() {
        int minValue = 30;
        for (int i = 0; i < this.values.size(); i++) {
            if (this.values.get(i) < minValue) {
                minValue = this.values.get(i);
            }
        }
        return minValue;
    }
}




