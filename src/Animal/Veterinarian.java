package Animal;

public class Veterinarian extends Animal{

    public Veterinarian(String food, String location) {
        super(food, location);
    }

    public void treatAnimal() {
        System.out.println(food + " " + location);
    }

    public  void treatAnimal(Animal[] animal) {
        System.out.println(food + " " + location);
    }

    public static void main(String[] args) {

        Animal max = new Dog("Косточка", "Конура", "kind", "home security");
        Animal lightning = new Horse("Трава", "Конюшня", "brown", "race", 60);
        Animal alica = new Cat("Рыбка", "Квартира", "short hair", 6, 12);

        Animal[] animal = new Animal[3];
        animal[0] = alica;
        animal[1] = lightning;
        animal[2] = max;

        for (int i = 0; i < animal.length; i++) {
           animal[i].treatAnimal();
        }
    }
}







