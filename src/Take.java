public class Take {
    static void take(CoffeeMachine coffeeMachine) {
        System.out.println("돈을 꺼내기: "+coffeeMachine.money+"원");
        coffeeMachine.money = 0;
    }
}
