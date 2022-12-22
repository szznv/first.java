import java.lang.*;
public class ball {
    private String colour;
    private int radius;
    public ball(String n, int b){
        colour = n;
        radius = b;
    }
    public ball(String n){
        colour = n;
        radius = 15;
    }
    public ball(){
        colour = "red";
        radius = 15;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColour(){
        return colour;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.colour+" ball, with radius =  "+this.radius;
    }
    public void BallDiam(){
        System.out.println(colour+" ball, with a diametr =  "+(2*radius));
    }
}