package CSDN.exercise6;

public class Mains {
    public static void main(String[] args) {
        Computer c = new Computer();
        Flash f = new Flash();
        Print p = new Print();
        c.plugin(f);
        c.plugin(p);
    }
}
