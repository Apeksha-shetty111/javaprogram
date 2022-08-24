class factorial{
    public static int fact(int n)
    {
        if(n==0||n==1)
        return 1;
        int facto=fact(n-1);
        int ans=n*facto;
        return ans;
        

        
        

    }
    public static void main(String args[])
    {
        int n=5;
        int facto=fact(n);
        System.out.print(facto);
    }

}