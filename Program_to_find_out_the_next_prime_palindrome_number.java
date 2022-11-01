import java.util.Scanner;
class manoj{
    public static boolean isprime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int nextpali(int n)
    {
        for(int i=n+1;;i++)
        {
            int temp=i;
            int s=0;
            while(temp!=0)
            {
                s=s*10+temp%10;
                temp/=10;
            }
            if(s==i && isprime(i))
            return i;
        }
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        System.out.println(nextpali(n));
    }
}