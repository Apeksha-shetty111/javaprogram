class fibo{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a);
        System.out.print(b);
        fibn(a,b,n-2);

    }
    public static void fibn(int a,int b,int n)
    {
        if(n==0)
        return;
        int c=a+b;
        System.out.print(c);
        fibn(b,c,n-1);


    }
}