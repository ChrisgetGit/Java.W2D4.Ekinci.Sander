package ChristianA2;

public class OverloadMethod {

    public void sum (int x, int y){
        System.out.println(x+y);
    }

    public void sum (int x, int y, int z){
        System.out.println(x+y+z);
    }

    public void sum (String x, String y){
        System.out.println(x + y);
    }
}
