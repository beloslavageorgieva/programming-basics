package Weekend_03;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //•   Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //•   Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //•   Всички останали са "unknown"

        switch (input) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
