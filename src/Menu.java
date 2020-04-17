import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static int newCalories;
    public static int totalCalories;

    public static void menu() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ReadFile.readFile();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Welcome to Daily Calorie Counter");
        System.out.println("--------------------------------");

        if (!ReadFile.splitWords[1].equals(GetDate.getDate())) {
            ReadFile.splitWords[0] = "0";
        }

        System.out.println("Today's date is: " + GetDate.getDate());
        System.out.println("----------------------");
        System.out.print("Enter calories to add: ");
        newCalories = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        totalCalories = Integer.parseInt(ReadFile.splitWords[0]) + newCalories;

        System.out.println("********************************");
        System.out.println("New total calories so far: " + totalCalories);
        System.out.println("********************************");
        System.out.println();


        ReadFile.splitWords[1] = GetDate.getDate();
        ReadFile.splitWords[0] = Integer.toString(totalCalories);
        WriteToFile.write();
        Thread.sleep(3000);
        //System.exit(0);


    }
}
