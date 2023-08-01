import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400,540,120,9,50000);
        while(true) {
            coffeeMachine.status();

            System.out.println("옵션을 선택하세요.");
            System.out.println("(1. 구매, 2. 채우기, 3.가져가기, 4. 종료):");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    Buy.paragraph();
                    int selectedCoffee = Integer.parseInt(sc.nextLine());
                    Buy.calculator(coffeeMachine, selectedCoffee);
                    break;
                case 2:
                    Fill.fill(coffeeMachine,sc);
                    break;
                case 3:
                    Take.take(coffeeMachine);
                    break;
                case 4:
                    System.out.println("커피머신이 종료되었습니다.");
                    break;

            }
            if (option == 4) break;

        }
    }
}
