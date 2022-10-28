import java.util.Scanner;
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
        int k=n*n;
        int temp=k,c=0;
        c/=2;
        int a[]=new int[100];
        int s=0;
        while(k!=0)
        {
           int r=k%10;
           a[s++]=r;
           k/=10;
           c--;
        }
        int p=0;
        for(int i=s/2-1;i>=0;i--)
        p=p*10+a[i];
        if(p==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}