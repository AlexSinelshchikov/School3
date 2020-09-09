package Animal;

public class Cat extends Animal {

    String lengthOfHair;
    int numberOfMiceCaughtPerWeek;
    int hoursOfSleepPerDay;

    public Cat ( String food, String location, String lengthOfHair, int numberOfMiceCaughtPerWeek, int hoursOfSleepPerDay) {
        super(food, location);
        this.lengthOfHair = lengthOfHair;
        this.numberOfMiceCaughtPerWeek = numberOfMiceCaughtPerWeek;
        this.hoursOfSleepPerDay = hoursOfSleepPerDay;

    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка сказала Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка скушала рыбку");
    }
}
