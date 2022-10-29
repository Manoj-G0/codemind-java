import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n1=t.nextInt();
        int a[]=new int[1000];
        for(int i=0;i<n1;i++)
        a[i]=t.nextInt();
        int n2=t.nextInt();
        int b[]=new int[1000];
        for(int i=0;i<n2;i++)
        b[i]=t.nextInt();
        int c=0;
        for(int i=0;i<n1;i++)
        {
            int flag=0;
            for(int j=0;j<n2;j++)
            {
                if(a[i]==b[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            c++;
        }
        if(c==n1 && c==n2)
        System.out.println("True");
        else
        System.out.println("False");
    }
}