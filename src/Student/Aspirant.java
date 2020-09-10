package Student;

public class Aspirant extends Student {

    String scientificWork;

    public Aspirant (String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {

        if (averageMark >= 5) {
            sumScholarship = 200;
        }
        else sumScholarship = 180;

        System.out.println("Аспирант." + " " + "Стипендия: " + sumScholarship);
    }

    public static void main(String[] args) {
        Student aspirant = new Aspirant("Иванов", "Сергей", "Экономка", 4.7, "Управление эффективностью бизнеса");
        Student student = new Student("Сидоров", "Николай", "Информатика", 5);

        Student[] studentsAspirant = new Student[] {aspirant, student} ;

        for (int i = 0; i < studentsAspirant.length; i++) {
            studentsAspirant[i].getScholarship();
        }
    }


}
