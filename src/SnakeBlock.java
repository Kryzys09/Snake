public class SnakeBlock {
    private SnakeBlock predecessor;
    private int x, y;

    public SnakeBlock(int x, int y){
        this.x = x;
        this.y = y;
    }

    public SnakeBlock getPredecessor(){return predecessor;}
    public int getX(){return x;}
    public int getY(){return y;}
    public void setPredecessor(SnakeBlock predecessor){this.predecessor=predecessor;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}

    public void move(int x, int y){
        try {
            predecessor.move(x, y);
        }catch(Exception ex){}
        this.x = x;
        this.y = y;
    }
}
