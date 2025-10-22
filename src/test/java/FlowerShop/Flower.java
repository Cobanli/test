package FlowerShop;

public class Flower {
    private static String flowerName;
    private static String colorFlower;
    private static int priceFlower;

    public Flower(String name, String color, int price){
        flowerName=name;
        colorFlower=color;
        priceFlower=price;
    }
    public static String getName(){
        return flowerName;

    }
    public static String getColor(){
        return colorFlower;
    }
    public  static int getPriceFlower(){
        return priceFlower;
    }
    public String toString(){
        return "Flower name"+ flowerName;
    }



}
