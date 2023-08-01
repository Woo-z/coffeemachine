import java.util.Scanner;

public class Fill {
    static void fill(CoffeeMachine coffeeMachine, Scanner sc) {
        System.out.println("추가할 물의 양을 입력하세요.");
        int water = Integer.parseInt(sc.nextLine());
        coffeeMachine.water += water;

        System.out.println("추가할 우유의 양을 입력하세요.");
        int milk = Integer.parseInt(sc.nextLine());
        coffeeMachine.milk += milk;

        System.out.println("추가할 원두의 양을 입력하세요.");
        int coffeeBeans = Integer.parseInt(sc.nextLine());
        coffeeMachine.coffeeBeans += coffeeBeans;

        System.out.println("추가할 일회용 컵의 양을 입력하세요.");
        int disposableCup = Integer.parseInt(sc.nextLine());
        coffeeMachine.disposableCup += disposableCup;
    }
}
