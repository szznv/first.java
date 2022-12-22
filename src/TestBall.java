import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        ball d1 = new ball("blue", 30);
        ball d2 = new ball("yellow");
        ball d3 = new ball();
        d2.setRadius(10);
        d3.setColour("green");
        d3.setRadius(5);
        d1.BallDiam();
        d2.BallDiam();
        d3.BallDiam();
    }
}