import java.util.*;
public class marks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("entr the size of the array");
        size=sc.nextInt();
        int numbers[]=new int[size];
        
        System.out.print("enter the array elements");
        for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
        }
        System.out.println("the elememys are");
        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

      