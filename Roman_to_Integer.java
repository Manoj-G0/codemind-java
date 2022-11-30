import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.next();
        int a[]=new int[100];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='M')
            a[i]=1000;
            else if(s.charAt(i)=='D')
            a[i]=500;
            else if(s.charAt(i)=='C')
            a[i]=100;
            else if(s.charAt(i)=='L')
            a[i]=50;
            else if(s.charAt(i)=='X')
            a[i]=10;
            else if(s.charAt(i)=='V')
            a[i]=5;
            else if(s.charAt(i)=='I')
            a[i]=1;
        }
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(a[i]>=a[i+1] || i==s.length()-1)
            {
                sum+=a[i];
            }
            else
            {
                sum-=a[i];
            }
        }
        System.out.println(sum);
    }
}