package classroom;



public class Classroom {
    private static String desk;
    private  static int numberDesk;
    public static String name;

    public Classroom( String classDesk, int classNumberDesk){
        desk=classDesk;
        numberDesk=classNumberDesk;
    }
    public static String classDesk01(){
        return desk;
    }
    public static int classNumberDesk01(){
        return numberDesk;

    }
    public String toString(){
        return "number of desk" + desk;
    }
}
