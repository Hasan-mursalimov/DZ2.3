import java.util.Random;

public class Person {

    private int age;
    private String name;
    Random random=new Random();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int min=0;
        int max=100;
        age=random.nextInt(min-max);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Sex sexM=Sex.MAN;
        Sex sexW=Sex.WOMAN;
        this.name = name;
    }

    public static void main(String[] args) {

    }

}
