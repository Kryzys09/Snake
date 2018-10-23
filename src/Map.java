import java.util.Random;

public class Map {
    private int width, height;
    private Fruit fruit;
    private Random random = new Random();

    public Map(int width, int height){
        this.height = height;
        this.width = width;
        fruit = new Fruit(random.nextInt(width), random.nextInt(height));
    }

    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public Fruit getFruit(){return fruit;}
    public Random getRandom(){return random;}
    public void setWidth(int width){this.width = width;}
    public void setHeight(int height){this.height = height;}
    public void setFruit(Fruit fruit){this.fruit = fruit;}
    public void setRandom(Random random){this.random = random;}

    public void fruitEaten(){
        fruit.setX(random.nextInt(width));
        fruit.setY(random.nextInt(height));
    }
}
