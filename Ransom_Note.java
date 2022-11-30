import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.next();
        String s1=t.next();
        int i,j,f=0,c=0;
        char k[]=s1.toCharArray();
        for(i=0;i<s.length();i++)
        {
            f=0;
            for(j=0;j<s1.length();j++)
            {
                if(s.charAt(i)==k[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            {
                k[j]='z';
                c++;
            }
        }
        if(c==s.length())
        System.out.println("True");
        else
        System.out.println("False");
    }
}