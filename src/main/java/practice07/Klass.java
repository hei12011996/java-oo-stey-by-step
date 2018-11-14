package practice07;

public class Klass {
    private Integer number;
    private String displayName;

    public Klass(Integer number){
        this.number = number;
        this.displayName = String.format("Class %d", number);
    }

    public Integer getNumber(){
        return this.number;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}
