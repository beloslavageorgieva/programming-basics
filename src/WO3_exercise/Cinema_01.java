package WO3_exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        // premiere = 12lv.
        // normal =7.50
        // discount (for students/kids/other students namalena ot 5lv.

        double income = 0.0;

        if ("Premiere".equals(typeOfProjection)){
            income = rows * columns * 12;
        } else if ("Normal".equals(typeOfProjection)) {
            income = rows * columns * 7.50;
        } else if ("Discount".equals(typeOfProjection)) {
            income = rows * columns * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
