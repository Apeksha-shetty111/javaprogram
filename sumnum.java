class sumnum{
    public static void psum(int n,int i,int sum)
    {
        
        if(i==n){
            sum=sum+1;
            System.out.print(sum);
            return;
        }
        
        sum=sum+i;
        psum(n,i+1,sum);
    }

public static void main(String args[])
{
    int n=10;
    int i=1;
    int sum=0;
    psum(n,i,sum);
}

    
}