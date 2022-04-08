package CSDN.exercise8;

public class Test {
    public static void main(String[] args) {
        Flower f = new Flower("白色","20");
//        f.setColor("红色;");
//        f.setPrice("20块");
       f.showlnfo();
        Rose r = new Rose("紫色","30","广西");
//        r.setOrigin("广东");
//        r.setColor("黑色;");
//        r.setPrice("50");
        r.showlnfo();
        r.warn();
    }
}
