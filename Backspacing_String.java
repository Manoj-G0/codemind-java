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
        String k=t.next();
        char s1[]=new char[100];
        char s2[]=new char[100];
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                s1[x++]=s.charAt(i);
            }
            else
            {
                x--;
            }
        }
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)!='#')
            {
                s2[y++]=k.charAt(i);
            }
            else
            {
                y--;
            }
        }
        int f=0;
        for(int i=0;i<x;i++)
        {
            if(s1[i]!=s2[i])
            {
                System.out.println("False");
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("True");
    }
}