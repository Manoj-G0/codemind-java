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
        String s=t.next();
        System.out.println(pm(s));
    }
}