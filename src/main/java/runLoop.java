/**
 * Created by Nikolay on 11.07.2016.
 */
public class RunLoop {
    public int y = 1;
    public int k;
    public int run(){
        for (k = 6; k >= 3; k--) y = y + k;
        return y;
    }
    public void print(){
        System.out.println("y = " + y);
        System.out.println("k = " + k);
    }
}
