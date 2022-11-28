import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n1=t.nextInt(),n2=t.nextInt();
        int x=t.nextInt();
        int car1=x,car2=0;
        int time=0;
        while(car1>=car2)
        {
            time++;
            car1+=n1;
            car2+=n2;
            if(time>2)
            break;
        }
        if(time>2)
        System.out.println(-1);
        else
        System.out.println(time);
        
    }
}