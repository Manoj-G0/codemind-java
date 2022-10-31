import java.util.Scanner;
class manoj{
    public static boolean isvowel(String s,int i,int j){
        int c=0;
        for(int k=i;k<j;k++)
        {
            if(s.charAt(k)=='a'|| s.charAt(k)=='e'|| s.charAt(k)=='i'|| s.charAt(k)=='o'|| s.charAt(k)=='u')
            {
                c++;
            }
        }
        if(c==j-i)
        return true;
        return false;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        while(te-- !=0)
        {
            String s=t.next();
            String k="";
            for(int i=s.length()-1;i>=0;i--)
            {
                k+=s.charAt(i);
            }
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==k.charAt(i))
                c++;
            }
            if(c==s.length())
            {
                if(c%2==0)
                System.out.println("YES EVEN");
                else
                System.out.println("YES ODD");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
    }
}