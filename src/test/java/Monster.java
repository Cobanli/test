public class Monster {

        private String name;
        private String type;
        private int x;
        private int y;

        public Monster(String name, String type)
        {
            this.name = name;
            this.type = type;
            this.x = 0;
            this.y = 0;
        }

        public void move(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

    public static void main(String[] args) {
        Monster monster=new Monster("hc","type");
        monster.move(2,5);
        System.out.println(monster.y);
        System.out.println(monster.type);
    }
    }


