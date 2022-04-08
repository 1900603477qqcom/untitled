package CSDN.exercise10;

public class Trianglele {
    Point m1;
    Point m2;
    Point m3;
    public static double GetL(Point m1,Point m2){
        return Math.sqrt(Math.pow(m1.getX()- m2.getX(),2)+Math.pow(m1.getY(), m2.getY()));
    }
    public static double girth(Point m1,Point m2,Point m3){
        return GetL(m1, m2)+GetL(m2,m3)+GetL(m1,m3);
    }
    public static double area(Point m1,Point m2,Point m3){
        double p = GetL(m1, m2)+GetL(m2,m3)+GetL(m1,m3);
        return Math.sqrt(p*(p-GetL(m1,m2)*(p-GetL(m2,m3)*(p-GetL(m2,m3)))));
    }

    public void setM1(Point m1) {
        this.m1 = m1;
    }

    public Point getM1() {
        return m1;
    }

    public void setM2(Point m2) {
        this.m2 = m2;
    }

    public Point getM2() {
        return m2;
    }

    public void setM3(Point m3) {
        this.m3 = m3;
    }

    public Point getM3() {
        return m3;
    }
}
