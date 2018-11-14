package practice10;

public class Klass {
    private Integer number;
    private String displayName;
    private Student leader;

    public Klass(Integer number){
        this.number = number;
        this.displayName = String.format("Class %d", number);
    }

    public void assignLeader(Student leader){
        if(leader.getKlass().number != this.number){
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = leader;
        }
    }

    public void appendMember(Student member){
        member.setKlass(this);
    }

    public Student getLeader(){
        return this.leader;
    }

    public Integer getNumber(){
        return this.number;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}


