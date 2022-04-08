package CSDN.exercise3;

public class Teacher extends Person{
    private String subject;
    void teach(String subject){
        System.out.println("我教授的是"+subject);
    }
    public Teacher(String name,int age, String subject){
        super(name,age);
        this.subject = subject;
    }
    public void setSubject(){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void toSting(){
        System.out.println("我的名字是："+this.name+",我的年龄是："+this.age);
    }

}
