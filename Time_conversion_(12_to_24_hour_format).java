import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int sum=0;
        for(int i=0;s.charAt(i)!=':';i++)
        {
            sum=sum*10+(int)s.charAt(i)-'0';
        }
        if(sum==12 && s.charAt(6)=='A')
        {
            sum-=12;
            System.out.printf("0%d:%c%c",sum,s.charAt(3),s.charAt(4));
        }
        else if(sum==12 && s.charAt(6)=='P')
        {
            System.out.printf("%d:%c%c",sum,s.charAt(3),s.charAt(4));
        }
        else if(sum<12 && s.charAt(6)=='P')
        {
            sum+=12;
            System.out.printf("%d:%c%c",sum,s.charAt(3),s.charAt(4));
        }
        else if(sum<12 && s.charAt(6)=='A')
        {
            if(sum<10)
            System.out.printf("0%d:%c%c",sum,s.charAt(3),s.charAt(4));
            else
            System.out.printf("%d:%c%c",sum,s.charAt(3),s.charAt(4));
        }
        else
        {
            System.out.printf("%d:%c%c",sum,s.charAt(3),s.charAt(4));
        }
        
    }
}