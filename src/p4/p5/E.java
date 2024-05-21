package p4.p5;

public class E {
    int speed;
    String engine;
    public E(String engine, int speed){
        this.speed = speed;
        this.engine = engine;
    }
    public void show_E(){
        System.out.println(speed + " " + engine);
    }
}
