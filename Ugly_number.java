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
        int flag=0;
        while(n!=1)
        {
            if(n%2==0)
            n/=2;
            else if(n%3==0)
            n/=3;
            else if(n%5==0)
            n/=5;
            else
            {
                flag=1;
                System.out.println("Not Ugly Number");
                break;
            }
        }
        if(flag==0)
        System.out.println("Ugly Number");
    }
}