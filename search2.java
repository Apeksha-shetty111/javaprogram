    import java.util.*;
public class search2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        System.out.print("enter the matrux");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
              a[i][j]=sc.nextInt();

            }
        }
        int search;
        System.out.print("entr the e;em to be searched");
        search=sc.nextInt();
         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(a[i][j]==search){

              System.out.print("the index of 6the element is "+ i +","+j);
            }}
        }
    }
}

