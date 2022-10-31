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
        String s=t.next();
        int c=0,k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            k++;
        }
        System.out.println(k);
        
    }
}