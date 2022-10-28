import java.util.*;
class manoj{
    public static boolean isprime(int n)
    {
        if(n<=1)
        return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a=0,b=1,c=1,m=0,k=0;
        for(int i=2;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            if(a<n)
            {
                m=a;
            }
            else
            {
                k=a;
                break;
            }
        }
        if(k-n==n-m)
        System.out.printf("%d %d",m,k);
        else if(k-n>n-m)
        System.out.println(m);
        else
        System.out.println(k);
    }
}