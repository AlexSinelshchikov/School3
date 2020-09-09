package Animal;

public class Horse extends Animal {

    int runningSpeedKmCh;
    String color;
    String destined;

    public Horse (String food, String location, String color, String destined, int runningSpeedKmCh) {
        super(food,location );
        this.color = color;
        this.destined = destined;
        this.runningSpeedKmCh = runningSpeedKmCh;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь скушала травку");
    }
}
