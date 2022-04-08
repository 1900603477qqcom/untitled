package CSDN.exercise5;

public class SportsCar extends Car{
//    重写抽象方法
    public void run(){
        System.out.println("超级跑车");
    }
    public void price(){
        System.out.println("售价100w");
    }
//    创建构造方法
    public SportsCar(String brand){
//        通过super来访问父类的成员变量，并赋值
        super(brand);
    }
    public SportsCar(){

    }
}
