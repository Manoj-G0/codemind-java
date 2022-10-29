import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        Arrays.sort(a,0,n);
        int i=n-1,j=n-2;
        while(i!=0)
        {
            System.out.printf("%d %d ",a[j],a[i]);
            i-=2;
            j-=2;
        }
        System.out.printf("%d ",a[0]);
    }
}