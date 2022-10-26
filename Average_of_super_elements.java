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
        int s=0,k=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && a[j]!=-100)
                c++;
            }
            if(c==a[i] && a[i]!=-100)
            {
                k++;
                s+=a[i];
                a[i]=-100;
            }
        }
        if(k!=0)
        System.out.printf("%.2f",s/(float)k);
        else
        System.out.println("-1");
    }
}