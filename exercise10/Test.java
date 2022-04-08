package CSDN.exercise10;

public class Test {
    public static void main(String[] args) {
        Trianglele tri = new Trianglele();
        Point m1 = new Point();
        Point m2 = new Point();
        Point m3 = new Point();
        m1.setTri(0,0);
        m2.setTri(4,3);
        m3.setTri(3,4);
        tri.setM1(m1);
        tri.setM2(m2);
        tri.setM3(m3);
        System.out.println("该三角形的周长是"+Trianglele.girth(m1,m2,m3));
        System.out.println("该三角形的面积是"+Trianglele.area(m1,m2,m3));
    }
}
