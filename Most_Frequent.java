import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[1000];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int max=0,m=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c>m)
            {
                m=c;
                max=a[i];
            }
            if(c==m)
            {
                if(max>a[i])
                max=a[i];
            }
        }
        System.out.println(max);
    }
}