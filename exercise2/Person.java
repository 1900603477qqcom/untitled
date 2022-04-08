/*
 编写一个Person抽象类，要求含有姓名（name）年龄（age）两个私有属性以及吃饭（eat） 和睡觉（sleep）两个抽象方法，
并写出带参构造方法，创建学生（student）和工人（worker） 两个类，继承Person类，学生类多出了私有属性学号和学习
方法（输出我爱学习），工 人类多出了私有属性工号和工作方法（输出我爱工作），在主函数中创建学生和工人类 的实例对象
，使用构造方法赋值，并输出所有属性和方法
 */
package CSDN.exercise2;
//设置一个抽象类   abstract
public abstract class  Person {
//    定义两个私有变量  private
    private String name;
    private int age;
//    定义两个抽象方法  abstract\
//    抽象方法一定出现在抽象类中，但是抽象类中也可以没有抽象方法，可以有普通方法
    public abstract void eat();
    public abstract void sleep();
//    建立构造方法
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
//    public void setName(String name){
//        this.name = name;
//    }
    public String getName(){

        return name;
    }
    public int getAge(){
        return age;
    }

}
