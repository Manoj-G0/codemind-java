import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=t.nextInt();
        }
        int res[]=new int[2];
        int i=0;
        int j=n-1;
        int b[]=new int[2];
        int f=0;
        while(i<n-2)
        {
            
            int c=0;
            for(int k=i;k<=j;k++)
            {
                if(a[k]==0)
                {
                    c++;
                }
                else
                {
                    c--;
                }
            }
            if(c==0)
            {
                b[0]=i;
                b[1]=j;
                f=1;
                break;
            }
            j--;
            if(i+1==j)
            {
                i++;
                j=n-1;
            }
        }
        if(f==0)
        System.out.println(-1);
        else
        {
            for(int s=0;s<2;s++)
            System.out.printf("%d ",b[s]);
        }
    }
}