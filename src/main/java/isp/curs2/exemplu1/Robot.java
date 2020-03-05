package isp.curs2.exemplu1;

public class Robot {
    public int x; //atribut

    public Robot() {
        this(1);
        System.out.println("Create object!");
    }

    public Robot(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

//    public void setX(int x) {
//        this.x = x;
//    }

    public void move(){
//        x++;
        this.move(1);
        System.out.println("Robot is moving:"+this);
    }

    public void move(int index){
        x+=index;
        System.out.println("Robot is moving:"+this);
    }

    public int computeDistance(Robot r){
        return this.x - r.x;
    }

    public String toString() {
        return "Robot{" +
                "x=" + x +
                '}';
    }
}
