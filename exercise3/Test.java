package CSDN.exercise3;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("LI_SAN",18,"grade3And4");
        s.toSting();
        s.study("mathematics");
        s.eat("durian");
        Teacher t = new Teacher("huangSan",25,"english");
        t.toSting();
        t.teach("english");
        t.eat("eggFriedRice");

}
}
