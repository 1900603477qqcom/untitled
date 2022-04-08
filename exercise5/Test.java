package CSDN.exercise5;

import CSDN.exercise4.Cat;

public class Test {
    public static void main(String[] args) {
//        下面两行是通过不同的方式给父类中的私有成员变量赋值
        SportsCar car1 = new SportsCar("奥迪RS7");
//        car1.setBrand("奥迪RS7");
        System.out.println(car1.getBrand());
        car1.run();
        car1.price();
        //        下面两行是通过不同的方式给父类中的私有成员变量赋值
        SportsCar car2 = new SportsCar("GTR");
        car2.setBrand("GTR");
        System.out.println(car2.getBrand());
        car2.run();
        car2.price();
    }
}
