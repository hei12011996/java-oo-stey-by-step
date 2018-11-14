package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
        this.klass = null;
    }

    public Klass getKlass(){
        return this.klass;
    }

    @Override
    public String introduce(){
        if (getKlass() == null) {
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", getKlass().getDisplayName());
        }
    }

    public String introduceWith(Student student){
        if (student.getKlass() == null || student.getKlass().getNumber() != this.getKlass().getNumber()) {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
    }
}

