import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.toLowerCase();
        int a[]=new int[100];
        int k=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                a[k++]=s.charAt(i)-'0';
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            continue;
            else
            {
                c++;
            }
        }
        int b[]=new int[100],d[]=new int[100];
        int t=0,q=0;
        if(c%2==0)
        {
            for(int i=0;i<k;i++)
            {
                if(a[i]%2==0)
                {
                    b[t++]=a[i];
                }
                else
                {
                    d[q++]=a[i];
                }
            }
            int i=0,j=0;
            while(i<t || j<q)
            {
                if(i!=t)
                System.out.printf("%d",b[i]);
                if(j!=q)
                System.out.printf("%d",d[j]);
                i++;
                j++;
            }
        }
        else
        {
            for(int i=0;i<k;i++)
            {
                if(a[i]%2==0)
                {
                    b[t++]=a[i];
                }
                else
                {
                    d[q++]=a[i];
                }
            }
            int i=0,j=0;
            while(i<t || j<q)
            {
                if(i!=q)
                System.out.printf("%d",d[i]);
                if(j!=t)
                System.out.printf("%d",b[j]);
                i++;
                j++;
            }
        }
            
    }
}