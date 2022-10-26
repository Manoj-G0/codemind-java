import java.util.*;
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
        int k=-100;
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    c++;
                    a[j]=k;
                }
            }
            if(a[i]!=-100)
            System.out.printf("%d %d ",a[i],c);
        }
    }
}