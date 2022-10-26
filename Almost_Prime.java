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
        int te=t.nextInt();
        while(te!=0)
        {
            te--;
            int n=t.nextInt();
            int c=0;
            int f=0;
            int a[]=new int[1000];
            for(int i=2;i<n;i++)
            {
                if(n%i==0 && isprime(i))
                {
                    a[f++]=i;
                }
            }
            int k=0;
            for(int i=0;i<f;i++)
            {
                for(int j=0;j<f;j++)
                {
                    if(a[i]*a[j]==n && i!=j)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==1)
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}