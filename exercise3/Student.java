package CSDN.exercise3;

public class Student extends Person{
   private String clas;
   public void study(String sudject){
       System.out.println("我热爱学习"+sudject);
   }
   public Student(String name,int age,String clas){
       super(name,age);
       this.clas = clas;
   }
   public void setClas(){
       this.clas = clas;
   }
   public String getclas() {
       return clas;
   }
    public void toSting(){
        System.out.println("我的名字是："+this.name+",我的年龄是："+this.age);
    }

}
