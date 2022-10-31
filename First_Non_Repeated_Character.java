import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        while(te-- !=0)
        {
            int n=t.nextInt();
            String s=t.next();
            int k=0;
            for(int i=0;i<s.length();i++)
            {
                int flag=0;
                for(int j=0;j<s.length();j++)
                {
                    if(i!=j && s.charAt(i)==s.charAt(j))
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.printf("%c
",s.charAt(i));
                    k=1;
                    break;
                }
            }
            if(k==0)
            System.out.println(-1);
        }
    }
}