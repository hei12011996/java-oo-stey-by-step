package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce(){
        if(this.klass.getLeader() == this){
            return super.introduce() + String.format(" I am a Student. I am Leader of %s.", this.getKlass().getDisplayName());
        } else {
            return super.introduce() + String.format(" I am a Student. I am at %s.", this.getKlass().getDisplayName());
        }
    }

    public boolean isIn(Klass klass){
        return this.klass.getNumber() == klass.getNumber();
    }
}

