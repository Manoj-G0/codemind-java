import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String t=in.next();
        char s[]=t.toCharArray();
        for(int i=0;i<t.length();i+=2)
        {
            int k=s[i]-(s[i+1]-'0');
            k=k%26;
            s[i+1]=(char)(k+'a');
        }
        for(int i=0;i<t.length();i++)
        System.out.printf("%c",s[i]);
    }
}