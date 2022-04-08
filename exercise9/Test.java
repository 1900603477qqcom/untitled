package CSDN.exercise9;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三","女",19,"高三20班");
         s.ACode();
         System.out.println("名字："+s.getName()+"性别："+s.getSex()+"年龄："+s.getAge()+"班级："+s.getClas());
    }
}
