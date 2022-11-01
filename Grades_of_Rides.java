import java.util.Scanner;
class manoj{
    public static int nextpali(int n)
    {
        for(int i=n+1;;i++)
        {
            int temp=i;
            int s=0;
            while(temp!=0)
            {
                s=s*10+temp%10;
                temp/=10;
            }
            if(s==i)
            return i;
        }
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int hf=t.nextInt(),spf=t.nextInt(),sf=t.nextInt();
        if(hf>50 && spf>60 && sf>100)
        System.out.println(10);
        else if(hf>50 && spf>60 && sf<=100)
        System.out.println(9);
        else if(hf<=50 && spf>60 && sf>100)
        System.out.println(8);
        else if(hf>50 && spf<=60 && sf>100)
        System.out.println(7);
        else if(hf>50 && spf<=60 && sf<=100)
        System.out.println(6);
        else if(hf<=50 && spf>60 && sf<=100)
        System.out.println(6);
        else if(hf<=50 && spf<=60 && sf>100)
        System.out.println(6);
        else
        System.out.println(5);
    }
}