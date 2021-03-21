import java.util.List;

public class Person {


    private int age;
    private String name;
    private Sex sex;


    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }

    public int compareTo(Person person) {
        int result = 0;
        if (this.getSex() != person.getSex()) {
            result = this.getSex() == Sex.MAN ? -1 : 1;
            return result;
        }
        if (this.getAge() - person.getAge() != 0) {
            return this.getAge() - person.getAge() > 0 ? -1 : 1;
        }
        result = this.getName().compareTo(person.getName());
        return result;
    }

}
