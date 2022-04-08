package CSDN.exercise9;

public class Student implements Programmer{
    private int age;
    private String name;
    private String clas;
    private String sex;
    public void ACode(){
        System.out.println("程序员在敲代码");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getClas() {
        return clas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    public Student(){

    }
    public Student(String name,String sex ,int age,String clas){
        this.age = age;
        this.clas = clas;
        this.name = name;
        this.sex = sex;
    }
}
