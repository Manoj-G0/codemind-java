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
        if(isprime(n))
        {
            int s=0;
            while(n!=0)
            {
                s=s*10+n%10;
                n/=10;
            }
            if(isprime(s))
            System.out.println("circular prime");
            else
            System.out.println("prime but not a circular prime");
        }
        else
        System.out.println("not prime");
    }
}