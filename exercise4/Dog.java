package CSDN.exercise4;
//继承父类，   extends
public  class Dog extends Animal{
    @Override
//    重写父类中的抽象方法
    public void play() {
        System.out.println("我是狗，我玩球");
    }
}
