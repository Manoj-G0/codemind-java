import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && a[i]!=0 && a[j]!=0)
                {
                    c++;
                    a[i]=0;
                    a[j]=0;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}