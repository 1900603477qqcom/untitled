package CSDN.exercise3;

public class Person {
    public String name;
    public int age;
    void eat(String something){
        System.out.println("我爱吃"+something);
    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void gerAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void toSting(){
       System.out.println("我的名字是："+this.name+",我的年龄是："+this.age);
    }
}
