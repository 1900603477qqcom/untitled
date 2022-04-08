package CSDN.exercise4;
import javax.swing.*;
/*
需求：首先定义一个抽象类Animal,抽象类中定义一个抽象方法play（）抽象方法，创建 一个猫Cat类，
继承Animal并重写play方法输出“我是猫，我玩老鼠”，创建一个狗类， 继承Animal并重写play方法
输出“我是狗，我玩球”。最后编写测试类TestDemo，通 过多态创建猫，通过多态创建狗，并调用猫对
象的play方，狗对象的play方法
 */
//创建一个抽象类   abstract
public abstract class Animal {
//    创建一个抽象方法
    public abstract void play();
}
