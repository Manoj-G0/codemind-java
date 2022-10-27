import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int m=1,st=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int l=i-1,h=i+1;
            while(h<n && s.charAt(h)==s.charAt(i))
            h++;
            while(l>=0 && s.charAt(l)==s.charAt(i))
            l--;
            while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
            {
                l--;
                h++;
            }
            int length=h-l-1;
            if(m<length)
            {
                m=length;
                st=l+1;
            }
        }
        for(int i=st;i<st+m;i++)
        {
            System.out.printf("%c",s.charAt(i));
        }
    }
}