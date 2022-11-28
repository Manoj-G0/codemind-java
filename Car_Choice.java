import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int te=t.nextInt();
        while(te-- !=0)
        {
            int x1=t.nextInt(),x2=t.nextInt();
            int y1=t.nextInt(),y2=t.nextInt();
            if(y1/(1.0*x1)>y2/(1.0*x2))
            System.out.println(1);
            else if(y1/(1.0*x1)<y2/(1.0*x2))
            System.out.println(-1);
            else
            System.out.println(0);
        }
    }
}