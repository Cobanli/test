package ShirtEx;

public class Shirt {

        private static String color;
        private static int size;

        Shirt(String colorName, int sizeNumber){
            color=colorName;
            size= sizeNumber;
        }
        public static String putOn(){
            return "Is put on";
        }

        public String toString(){
            return color +" is  color" + size +" is size";
        }
    }

