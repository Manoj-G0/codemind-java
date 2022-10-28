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
        int a[]=new int[100];
        int k=0;
        while(n!=0)
        {
            a[k++]=n%10;
            n/=10;
        }
        for(int i=k-1;i>=0;i--)
        {
            if(a[i]==6)
            {
                a[i]=9;
                break;
            }
        }
        for(int i=k-1;i>=0;i--)
        System.out.printf("%d",a[i]);
    }
}