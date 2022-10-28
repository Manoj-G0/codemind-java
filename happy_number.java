import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int temp=n;
        int s=0;
        while(temp!=1 && temp!=4)
        {
            s=0;
            while(temp!=0)
            {
                int r=temp%10;
                s+=r*r;
                temp/=10;
            }
            temp=s;
        }
        if(s==1 || s==7)
        System.out.println("True");
        else
        System.out.println("False");
    }
}