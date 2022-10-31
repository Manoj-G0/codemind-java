import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int a[]=new int[26];
        for(int i=0;i<26;i++)
        a[i]=0;
        int k=-1;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                k=a[i];
                break;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=k && a[i]!=0)
            {
                c++;
            }
        }
        if(c==1 || c==0)
        System.out.println("Valid String");
        else
        System.out.println("Not Valid");
    }
}