import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[1000];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int s1=a[0],s2=a[0];
        for(int i=1;i<n;i++)
        {
            s1=Math.max(a[i]+s1,a[i]);
            s2=Math.max(s1,s2);
        }
        System.out.println(s2);
    }
}