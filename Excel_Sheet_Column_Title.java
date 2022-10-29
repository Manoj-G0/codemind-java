import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        char s[]=new char[100];
        int k=0;
        while(n!=0)
        {
            s[k++]=(char)((n-1)%26+'A');
            n=(n-1)/26;
        }
        for(int i=k-1;i>=0;i--)
        System.out.printf("%c",s[i]);
        
    }
}