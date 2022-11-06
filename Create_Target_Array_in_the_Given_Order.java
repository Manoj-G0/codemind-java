import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int a[]=new int[1000];
        int b[]=new int[1000];
        int n=t.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int k=t.nextInt();
        for(int i=0;i<k;i++)
        {
            b[i]=t.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=c.length-1;j>b[i];j--)
            {
                c[j]=c[j-1];
            }
            c[b[i]]=a[i];
        }
        for(int i=0;i<n;i++)
        System.out.printf("%d ",c[i]);
    }
}