//print x^n(stack height=n)
class height{
    public static void main(String args[])
    {
        int x=2;
        int n=5;
        int ans=pow(x,n);
        System.out.print(ans);
}
     public static int pow(int x,int n)
     {
         if(x==0)
         return 0;
        if(n==0)
        return 1;
         int power=pow(x,n-1);
         int ans=x*power;
         return ans;
     }
}