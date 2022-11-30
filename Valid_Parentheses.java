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
        int te=t.nextInt();
        while(te-- !=0)
        {
            String k=t.next();
            char s[]=k.toCharArray();
            if(isvalid(s,k.length()))
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}