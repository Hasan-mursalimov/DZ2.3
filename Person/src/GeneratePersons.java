import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePersons extends Person {
    Random random = new Random();
    String nameWoman[] = {"Камила", "Арина", "Дарья", "Александра", "Луиза"};
    String[] nameMan = {"Андрей", "Антон", "Артем", "Артур", "Амир", "Хасан"};
    int m = (int) Math.floor(Math.random() * nameMan.length*nameWoman.length);
    Sex sex[] = {Sex.MAN, Sex.WOMAN};
    int min = 0;
    int max = 100;
    int ageRnd = random.nextInt(min - max);

    public GeneratePersons() {

    }


    public List<Person> generatePersons(String name, int age, Sex sex) {
        List<Person> personList = new ArrayList<>();


            for (int a = 0; a < personList.size(); a++) {



                age = ageRnd;
                name = nameMan[m]+nameWoman[m];
                switch (sex){
                    case MAN:
                        int w = (int) Math.floor(Math.random() * nameMan.length);
                        name=nameMan[w];
                        break;
                    case WOMAN:
                        int m = (int) Math.floor(Math.random() * nameMan.length);
                        name=nameWoman[m];
                        break;
                }
                Person person = new Person(name, age, sex);
                personList.add(person);
            }


        return generatePersons(name, age, sex);
    }




}
