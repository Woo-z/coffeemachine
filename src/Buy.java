public class Buy {

    static void paragraph() {
        System.out.println("어떤 커피를 구매하시겠습니까 ?");
        System.out.println("1. 에스프레소 (가격: 4000원)");
        System.out.println("2. 라떼 (가격: 7000원)");
        System.out.println("3. 카푸치노 (가격: 6000원)");
    }

    static void thankYou(int selectedCoffee) {
        System.out.println("커피를 구매하였습니다. 감사합니다.");
        switch (selectedCoffee) {
            case 1:
                System.out.println("에스프레소가 준비되었습니다. 맛있게 드세요!");
                break;
            case 2:
                System.out.println("라떼가 준비되었습니다. 맛있게 드세요!");
                break;
            case 3:
                System.out.println("카푸치노가 준비되었습니다. 맛있게 드세요!");
                break;
        }
        System.out.println();
    }

    static void calculator(CoffeeMachine coffeeMachine, int selectedCoffee) {

        switch (selectedCoffee) {
            case 1:
                Espresso espresso = new Espresso();

                if (coffeeMachine.water < espresso.water) {
                    System.out.println("물이 부족합니다.");
                    return;
                } else if (coffeeMachine.milk < espresso.milk) {
                    System.out.println("우유가 부족합니다.");
                    return;
                } else if (coffeeMachine.coffeeBeans < espresso.coffeeBeans) {
                    System.out.println("원두가 부족합니다.");
                    return;
                } else if (coffeeMachine.disposableCup < espresso.disposableCup) {
                    System.out.println("일회용 컵이 부족합니다.");
                    return;
                } else{
                    coffeeMachine.water -= espresso.water;
                    coffeeMachine.milk -= espresso.milk;
                    coffeeMachine.coffeeBeans -= espresso.coffeeBeans;
                    coffeeMachine.disposableCup -= espresso.disposableCup;
                    coffeeMachine.money += espresso.money;

                    thankYou(selectedCoffee);
                    return;

                }
            case 2:
                Latte latte = new Latte();

                if (coffeeMachine.water < latte.water) {
                    System.out.println("물이 부족합니다.");
                    return;
                } else if (coffeeMachine.milk < latte.milk) {
                    System.out.println("우유가 부족합니다.");
                    return;
                } else if (coffeeMachine.coffeeBeans < latte.coffeeBeans) {
                    System.out.println("원두가 부족합니다.");
                    return;
                } else if (coffeeMachine.disposableCup < latte.disposableCup) {
                    System.out.println("일회용 컵이 부족합니다.");
                    return;
                } else{
                    coffeeMachine.water -= latte.water;
                    coffeeMachine.milk -= latte.milk;
                    coffeeMachine.coffeeBeans -= latte.coffeeBeans;
                    coffeeMachine.disposableCup -= latte.disposableCup;
                    coffeeMachine.money += latte.money;

                    thankYou(selectedCoffee);
                    return;
                }
            case 3:
                Cappuccino cappuccino = new Cappuccino();

                if (coffeeMachine.water < cappuccino.water) {
                    System.out.println("물이 부족합니다.");
                    return;
                } else if (coffeeMachine.milk < cappuccino.milk) {
                    System.out.println("우유가 부족합니다.");
                    return;
                } else if (coffeeMachine.coffeeBeans < cappuccino.coffeeBeans) {
                    System.out.println("원두가 부족합니다.");
                    return;
                } else if (coffeeMachine.disposableCup < cappuccino.disposableCup) {
                    System.out.println("일회용 컵이 부족합니다.");
                    return;
                } else{
                    coffeeMachine.water -= cappuccino.water;
                    coffeeMachine.milk -= cappuccino.milk;
                    coffeeMachine.coffeeBeans -= cappuccino.coffeeBeans;
                    coffeeMachine.disposableCup -= cappuccino.disposableCup;
                    coffeeMachine.money += cappuccino.money;

                    thankYou(selectedCoffee);
                    return;
                }
            default:
        }
    }
}
