import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneratePersons extends Person {
    static Random random = new Random();
    static String[] nameWoman = {"Камила", "Арина", "Дарья", "Александра", "Луиза"};
    static String[] nameMan = {"Андрей", "Антон", "Артем", "Артур", "Амир", "Хасан"};
    int m = (int) Math.floor(Math.random() * nameMan.length * nameWoman.length);
    Sex[] sex = new Sex[]{Sex.MAN, Sex.WOMAN};

    public GeneratePersons(String name, int age, Sex sex) {
        super(name, age, sex);
    }


    public List<Person> generatePersons(int num) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            personList.add(new Person(nameGen(), ageGen(), sexGen()));
        }
        return personList;
    }

    static String nameGen() {
        int m = (int) Math.floor(Math.random() * nameMan.length);
        name = nameMan[m];
        int w = (int) Math.floor(Math.random() * nameWoman.length);
        name = nameMan[w];
        return name.toString();
    }

    static int ageGen() {
        int ageRnd = random.nextInt(0 - 100);
        return age;
    }

    static Sex sexGen() {
        if (random.nextInt(2) == 0) return Sex.WOMAN;
        else return Sex.MAN;
    }

    static int num() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}