

public class Person {


    private int age;
    private String name;
    private Sex sex;



    public Person(String name, int age, Sex sex) {
    }

    public Person() {
    }


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = this.age;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
