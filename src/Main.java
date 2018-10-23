public class Main {
    private static int snakeLength=0;
    public static void main(String[] args) {
        Map map = new Map(20, 20);
        SnakeBlock head = new SnakeBlock(map.getWidth()/2, map.getHeight()/2);
        playGame(map, head);
        System.out.println("GAME OVER! \nYOUR SCORE: " + snakeLength);
    }

    private static void playGame(Map map, SnakeBlock head){

    }
}
