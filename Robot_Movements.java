import java.util.Scanner;
class manoj{
    public static int bot(String s1,String s2){
        int x=0,y=0,n=s1.length();
        while(x<n && y<n)
        {
            if(s1.charAt(x)=='#')
            x++;
            else if(s2.charAt(y)=='#')
            y++;
            else if(s1.charAt(x)!=s2.charAt(y))
            return 0;
            else if(s1.charAt(x)=='B' && s2.charAt(y)=='B' && x>y)
            return 0;
            else if(s1.charAt(x)=='A' && s2.charAt(y)=='A' && x<y)
            return 0;
            else
            {
                x++;
                y++;
            }
            
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s1=t.next(),s2=t.next();
        if(bot(s1,s2)==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}