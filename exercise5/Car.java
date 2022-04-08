package CSDN.exercise5;

//需求：首先定义一个抽象类Animal,抽象类中定义一个抽象方法play（）抽象方法，
// 创建 一个猫Cat类，继承Animal并重写play方法输出“我是猫，我玩老鼠”，创建一个狗类，
// 继承Animal并重写play方法输出“我是狗，我玩球”。最后编写测试类TestDemo，通 过多态创建猫，
// 通过多态创建狗，并调用猫对象的play方，狗对象的play方法

public abstract class Car {
//    如果定义了一个私有成员变量的时候，要访问或者获取这个变量的时候，就可以编写set加成员变量名 或者 get加成员变量名 方法调用
    private String brand;
//    定义了一个getBrand让需要调用这个成员变量的类可以获取这个成员变量的值
    public String getBrand(){
        return brand;
    }
//    通过别的类传参的方式来给这个私有的成员变量赋值
    public void setBrand(String brand){
        this.brand = brand;
    }
//    创建一个构造方法
    public Car(String brand){
        this.brand = brand;
    }
    public Car(){
    }
//    创建一个抽象方法
    public abstract void run();
}
