import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneratePersons  {

    private static Random random=new Random();

    public List<Person> generatePersons(){
        List<Person>personList=new ArrayList<>();
        //цикл для создания 10000 персон
        for (int i=0;i<10001;i++){
            personList.add(new Person( generateName(),generateAge(),generateSex()));
        }
        return personList;
    }


    public String generateName(){
        //рандомное значение из массива
        String [] name=new String[]{"fff","sss","sass","sdasd","sdasd"};
        String randomName=name[random.nextInt(name.length)];
        return randomName;
    }
    public int generateAge(){
        //при попытке вычесления рандомного значения выводит ошибка IllegalArgumentException, пока решить не смог
        int  age=100;
        return age;
    }
    public static Sex generateSex(){
        return Sex.values()[random.nextInt(Sex.values().length)];
    }
}