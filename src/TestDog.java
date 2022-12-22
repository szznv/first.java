import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Bill");
        Dog d3 = new Dog();
        d2.setAge(1);
        d3.setName("Helen");
        d3.setAge(5);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
