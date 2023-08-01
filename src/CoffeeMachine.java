public class CoffeeMachine{
    int water;
    int milk;
    int coffeeBeans;
    int disposableCup;
    int money;


    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCup, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCup = disposableCup;
        this.money = money;
    }

    void status() {
        System.out.println("현재 커피머신 상태:");
        System.out.println("남은 재료와 돈 상태");
        System.out.println("물: "+this.water+"ml");
        System.out.println("우유: "+this.milk+"ml");
        System.out.println("원두: "+this.coffeeBeans+"g");
        System.out.println("일회용 컵: "+this.disposableCup+"개");
        System.out.println("돈: "+this.money+"원");
        System.out.println();
    }
}
