package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klasses = new LinkedList<>();

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> klasses){
        super(id, name, age);
        this.klasses.addAll(klasses);
        for(Klass klass : this.klasses){
            klass.assignTeacher(this);
        }
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses(){
        return this.klasses;
    }

    public void announceNewMember(Klass klass, Student student){
        System.out.print(String.format("I am %s. I know %s has joined %s.\n", this.getName(), student.getName(), klass.getDisplayName()));
    }

    public void announceNewLeader(Klass klass, Student student){
        System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", this.getName(), student.getName(), klass.getDisplayName()));
    }

    @Override
    public String introduce(){
        if (this.klasses.size() == 0) {
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        } else {
            String introduction = super.introduce() + " I am a Teacher. I teach ";
            for(int i = 0; i < this.klasses.size(); i++){
                Klass klass = this.klasses.get(i);
                if(i == 0){
                    introduction += String.format("%s", klass.getDisplayName());
                } else if (i == this.klasses.size() - 1){
                    introduction += String.format(", %d.", klass.getNumber());
                } else {
                    introduction += String.format(", %d", klass.getNumber());
                }
            }
            return introduction;
        }
    }

    public boolean isTeaching(Student student){
        if (student.getKlass() == null){
            return false;
        }
        boolean isTeaching = false;
        for(Klass klass : this.klasses){
            if(student.getKlass().getNumber().equals(klass.getNumber())){
                isTeaching = true;
            }
        }
        return isTeaching;
    }

    public String introduceWith(Student student){
        if (!this.isTeaching(student)) {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
    }
}
