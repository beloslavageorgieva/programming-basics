package W01_exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pageForOneHour = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int sumHours = pages / pageForOneHour;
        int daysNeededToRead = sumHours / numberDays;

        System.out.println(daysNeededToRead);

    }
}
