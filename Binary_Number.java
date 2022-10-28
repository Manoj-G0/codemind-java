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
        int k=(int)Math.pow(2,n);
        int a[]=new int[100];
        for(int i=0;i<k;i++)
        {
            int x=n;
            int s=0;
            int p=i;
            while(x!=0)
            {
                x--;
                a[s++]=p%2;
                p/=2;
            }
            for(int j=s-1;j>=0;j--)
            System.out.printf("%d",a[j]);
            System.out.println();
        }
    }
}