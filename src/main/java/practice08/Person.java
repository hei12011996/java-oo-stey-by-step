package practice08;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId(){
        return this.id;
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

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        return this.getId().equals(((Person) obj).getId());
    }
}
