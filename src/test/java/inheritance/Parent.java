package inheritance;

public class Parent {
    public String name;
    public int age;
    public Parent(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String placeToLive(){

        return ("I line in Apex");
    }
}
