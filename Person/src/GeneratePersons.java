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
        List<Person> person = new ArrayList<>();


            for (int a = 0; a < person.size(); a++) {



                age = ageRnd;
                name = nameMan[m]+nameWoman[m];
                switch (sex){
                    case MAN:
                        int w = (int) Math.floor(Math.random() * nameMan.length);
//                        person.setName(nameMan[w]);
                    case WOMAN:
                        int m = (int) Math.floor(Math.random() * nameMan.length);
//                        person.setName(nameWoman[m]);
                }
                Person person1 = new Person(name, age, sex);
                person.add(person1);
            }


        return generatePersons(name, age, sex);
    }




}
