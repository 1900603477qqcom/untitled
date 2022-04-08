package CSDN.exercise8;

public class Rose extends Flower{
    private String Origin;
    public void setOrigin(String Origin){
        this.Origin = Origin;
    }
    public String getOrigin(){
        return Origin;
    }
    public void showlnfo(){
        super.showlnfo();
        System.out.println("这朵花产自："+Origin);
    }
    public void warn(){
        System.out.println("警告！！！"+'\n'+"请不要摘这朵花，小心扎手");
    }
    public Rose(String color,String price,String Origin){
        super(color,price);
//        super.setColor(color);
//        super.setPrice(price);
        this.Origin = Origin;
    }
}
