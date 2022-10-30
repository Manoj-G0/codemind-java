import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int a[]=new int[100],k=0,c=0,b[]=new int[100];
        for(int i=0;i<s.length();i+=2)
        {
            a[k++]=s.charAt(i)-'0';
        }
        int f=0;
        for(int i=0;i<k;i++)
        {
            int sum=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                sum+=j;
            }
            for(int j=0;j<k;j++)
            {
                if(a[j]==sum)
                {
                    b[c++]=a[i];
                    f=1;
                }
            }
        }
        if(f==0)
        System.out.println(-1);
        else
        {
            Arrays.sort(b,0,c);
            for(int i=0;i<c;i++)
            System.out.printf("%d ",b[i]);
        }
        
    }
}