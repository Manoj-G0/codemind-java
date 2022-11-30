import java.util.Scanner;
class manoj{
    public static boolean isvalid(char[] s,int n)
    {
        if(n%2==1)
        return false;
        int top=-1;
        char st[]=new char[100];
        for(int i=0;i<n;i++)
        {
            if(s[i]=='[' || s[i]=='{' || s[i]=='(')
            {
                st[++top]=s[i];
            }
            else
            {
                if(s[i]==']')
                {
                    if(top<0 || st[top--]!='[')
                    return false;
                }
                else if(s[i]=='}')
                {
                    if(top<0 || st[top--]!='{')
                    return false;
                }
                else if(s[i]==')')
                {
                    if(top<0 || st[top--]!='(')
                    return false;
                }
            }
        }
        if(top<=0)
        return true;
        return false;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.next();
        int b=0,a=0,l=0,o=0,n=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            b++;
            else if(s.charAt(i)=='a')
            a++;
            else if(s.charAt(i)=='l')
            l++;
            else if(s.charAt(i)=='o')
            o++;
            else if(s.charAt(i)=='n')
            n++;
            if(b>=1 && a>=1 && l>=2 && o>=2 && n>=1)
            {
                b--;
                a--;
                l-=2;
                o-=2;
                n-=1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}