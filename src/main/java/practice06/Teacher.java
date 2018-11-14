package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, Integer age, Integer klass){
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age){
        super(name, age);
        this.klass = null;
    }

    public Integer getKlass(){
        return this.klass;
    }

    @Override
    public String introduce(){
        if (getKlass() == null) {
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", getKlass());
        }
    }
}
