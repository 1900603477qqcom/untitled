package CSDN.exercise2;
//编写学生（student)类继承Person类   extends
public class Student extends Person {
//定义学生私有的属性（成员变量）  private
    private int stucode;
    private String stumens;
//    创建构造方法传参赋值
    public Student(String name, int age, int stucode){
        super(name,age);//访问父类中的构造方法，并给父类的成员变量name，age赋值
        this.stucode = stucode;////用this给成员变量stucode赋值
        System.out.println("姓名："+this.getName()+" 年龄："+this.getAge()+" 学号 ："+this.stucode);
    }
//    重写父类中的抽象方法方法
    public void eat()
    {
        System.out.println("食堂吃饭");
    }
    public void sleep(){
        System.out.println("我爱学习");
    }
}
