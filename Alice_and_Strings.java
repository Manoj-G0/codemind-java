import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        while(te-- !=0)
        {
            String s1=t.next();
            String s2=t.next();
            int f=0;
            for(int i=0;i<s1.length();i++)
            {
                if(s2.charAt(i)-s1.charAt(i)<0)
                {
                    System.out.println("NO");
                    f=1;
                    break;
                }
            }
            if(f==0)
            System.out.println("YES");
        }
    }
}