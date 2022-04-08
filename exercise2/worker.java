package CSDN.exercise2;
//编写工人worker这个类继承Person类    extends
public  class worker extends Person{
    //定义工人私有的属性（成员变量）  private
    private int worcode;
    private String wormens;
    //    创建构造方法传参赋值
    public worker(String name,int age,int worcode){
        super(name,age);////super 访问父类中的构造方法，并给父类的成员变量name，age赋值
        this.worcode = worcode;//用this给成员变量worcode赋值
        System.out.println("姓名："+this.getName()+" 年龄 ："+this.getAge()+" 工号 ；"+wormens);
    }
//    重写父类中的抽象方法方法
    public void eat(){
        System.out.println("自己做饭吃");
    }
    public void sleep(){
        System.out.println("在家睡觉");
    }
    public void study(){
        System.out.println("我爱工作");
    }
}
