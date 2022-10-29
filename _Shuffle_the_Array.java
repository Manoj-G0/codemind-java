import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[1000];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int k=t.nextInt();
        int i=0,j=n/2;
        while(j!=n)
        {
            System.out.printf("%d %d ",a[i],a[j]);
            i++;
            j++;
        }
    }
}