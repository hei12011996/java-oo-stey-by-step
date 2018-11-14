package practice02;

public class Student extends Person{
    private Integer klass;

    public Student(String name, Integer age, Integer klass){
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass(){
        return this.klass;
    }

    @Override
    public String introduce(){
        return String.format("I am a Student. I am at Class %d.", this.getKlass());
    }
}
