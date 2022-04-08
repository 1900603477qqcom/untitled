package CSDN.exercise2;

public class Mains {
//    main函数入口
    public static void main(String[] args) {
//创建学生对象,并通过传参赋值
   Student s = new Student("李四",18,1024);
//   有对象调用方法
         s.eat();
         s.sleep();
//         创建工人对象,并通过传参赋值
        worker w = new worker("张三",20,1025);
         w.sleep();
         w.study();
         w.eat();
    }
}
