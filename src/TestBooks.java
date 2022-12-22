import java.lang.*;
public class TestBooks {
    public static void main(String[] args) {
        book d1 = new book("The Old Man and The Sea","Ernest Hemingway",1952);
        book d2 = new book("A Farewell to Arms");
        book d3 = new book();
        d2.setDate(1929);
        d2.setAuthor("Ernest Hemingway");
        d3.setDate(1964);
        d3.setTitle("A Moveable Feast");
        d1.infoBook();
        d2.infoBook();
        d3.infoBook();
    }
}