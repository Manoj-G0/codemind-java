import java.util.Scanner;
class manoj{
    public static int pm(String s)
    {
        char st[]=new char[100];
        int k=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
            {
                st[++k]=s.charAt(i);
            }
            else if(k==-1)
            return i+1;
            else
            {
                if(s.charAt(i)==']' && st[k]!='[')
                return i+1;
                else if(s.charAt(i)=='}' && st[k]!='{')
                return i+1;
                else if(s.charAt(i)==')' && st[k]!='(')
                return i+1;
                else
                k--;
            }
        }
        if(k!=-1)
        return s.length()+1;
        return 0;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        for(int i=0;i<n;i++)
        b[i]=t.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[j]>=a[i])
                {
                    c++;
                    b[j]=0;
                    break;
                }
            }
        }
        System.out.println(n-c);
    }
}