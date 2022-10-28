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
        String k=t.nextLine();
        char s[]=k.toCharArray();
        int a[]=new int[100];
        for(int i=0;i<k.length();i++)
        {
            if(s[i]=='I')
            a[i]=1;
            else if(s[i]=='V')
            a[i]=5;
            else if(s[i]=='X')
            a[i]=10;
            else if(s[i]=='L')
            a[i]=50;
            else if(s[i]=='C')
            a[i]=100;
            else if(s[i]=='D')
            a[i]=500;
            else if(s[i]=='M')
            a[i]=1000;
        }
        int sum=0;
        for(int i=0;i<k.length();i++)
        {
            if(i==k.length()-1 || a[i]>=a[i+1])
            sum+=a[i];
            else
            sum-=a[i];
        }
        System.out.println(sum);
    }
}