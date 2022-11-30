import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        String s1=t.next();
        char s[]=s1.toCharArray();
        int f=0;
        for(int i=0;i<te-1;i++)
        {
            if(s[i]=='H' && s[i+1]=='H')
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("YES");
            for(int i=0;i<te;i++)
            {
                if(s[i]=='.')
                {
                    s[i]='B';
                }
                System.out.printf("%c",s[i]);
            }
        }
        else
        System.out.println("NO");
    }
}