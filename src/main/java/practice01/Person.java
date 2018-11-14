package practice01;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", getName(), getAge());
    }
}
