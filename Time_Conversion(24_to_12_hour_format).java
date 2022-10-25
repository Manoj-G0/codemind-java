import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.next();
        int sum=0;
        for(int i=0;s.charAt(i)!=':';i++)
        {
            sum=sum*10+(int)s.charAt(i)-'0';
        }
        if(sum==0)
        {
            System.out.println("12:00 AM");
        }
        else if(sum<12)
        {
            System.out.printf("%s AM",s);
        }
        else if(sum==12)
        {
            System.out.printf("%s PM",s);
        }
        else if(sum>12 && sum<22)
        {
            sum-=12;
            System.out.printf("0%d:%c%c PM",sum,s.charAt(3),s.charAt(4));
        }
        else if(sum>=22 && sum<=23)
        {
            sum-=12;
            System.out.printf("%d:%c%c PM",sum,s.charAt(3),s.charAt(4));
        }
        
    }
}