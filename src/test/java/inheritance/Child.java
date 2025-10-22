package inheritance;

public class Child extends Parent{

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public String placeToLive() {
        //super.placeToLive();
        return ("I live in Raleigh");

    }
}