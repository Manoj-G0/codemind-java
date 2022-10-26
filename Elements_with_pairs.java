import java.util.Scanner;
class manoj{
    public static boolean isprime(int n){
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[100];;
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            System.out.printf("%d ",a[i]);
        }
        else
        {
            for(int i=0;i<n;i++)
            System.out.printf("%d ",a[i]);
            System.out.println(0);
        }
        
    }
}