package CSDN.exercise1;

public class BirdTest {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.eat();
        Bird b = (Bird)a;
        b.eat();
        b.fly();
    }
}
