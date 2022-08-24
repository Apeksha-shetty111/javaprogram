import java.util.*;
public class set{
    public static void main(String args[]){
        int n=5;
        int pos =1;
        int bitmask=1<<pos;
        int number=bitmask|n;
        System.out.print(number);
    }
}
