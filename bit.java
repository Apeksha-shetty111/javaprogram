import java.util.*;
public class bit{
    public static void main(String args[]){
        int n=5;
        int pos =3;
        int bitmask=1<<pos;
        if((bitmask&n)==0)
        {
            System.out.print("bit is zero");

        }
        else
        {
            System.out.print("bit is one");

        }
    }
}

    