import java.util.*;
class manoj{
    public static int sarray(int[] a,int n,int k)
    {
        int j;
        for(int i=0;i<n;i++)
            {
                int flag=0;
                int s=a[i];
                for(j=i+1;j<n+1;j++)
                {
                    if(s==k)
                    {
                        System.out.printf("%d %d
",i+1,j);
                        return 1;
                    }
                    else if(s>k || j==n)
                    {
                        break;
                    }
                    s+=a[j];
                }
            }
            return 0;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        while(te!=0)
        {
            te--;
            int n=t.nextInt(),k=t.nextInt();
            int a[]=new int[1000];
            for(int i=0;i<n;i++)
            a[i]=t.nextInt();
            int c=0,j;
            int p=sarray(a,n,k);
            if(p==0)
            System.out.println(-1);
        }
    }
}