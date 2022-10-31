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
            int f=0;
            String s=t.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        
    }
}