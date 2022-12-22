import java.lang.*;
public class book {
    private String title;
    private String author;
    private int date;
    public book(String n, String a, int b){
        title = n;
        author = a;
        date = b;
    }
    public book(String n){
        title = n;
        author = "Unknown";
        date = 2023;
    }
    public book(){
        title = "Unknown";
        author = "Unknown";
        date = 2023;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getDate() {
        return date;
    }
    public String toString(){
        return this.title+", by "+this.author+", "+this.date;
    }
    public void infoBook(){
        System.out.println(title+", written by "+author+", in "+date);
    }
}