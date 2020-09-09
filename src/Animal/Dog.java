package Animal;

public class Dog extends Animal {
    String food = "Косточка";
    String location = "Конура";
    String character;
    String profession;

    public Dog (String food, String location, String character, String profession) {
        super(food, location);
        this.character = character;
        this.profession = profession;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака сказала Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака скушала косточку");
    }
}
