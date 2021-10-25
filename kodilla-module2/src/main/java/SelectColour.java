import java.util.Scanner;

public class SelectColour {
    public static String userSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select first letter of colour, available letters: w, b, r, y, o, g: ");
        while (true) {
            String colour = scanner.nextLine().trim();
            switch (colour) {
                case "w":
                    return "white";
                case "b":
                    return "black";
                case "r":
                    return "red";
                case "y":
                    return "yellow";
                case "o":
                    return "orange";
                case "g":
                    return "green";
                default:
                    System.out.println("Selected letter is not available. Try again.");
            }
        }
    }
}
