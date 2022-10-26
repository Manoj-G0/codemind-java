import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        if(n%3==0 && n%5==0 && n%7==0)
        System.out.println("PlingPlangPlong");
        else if(n%3==0 && n%5==0 && n%7!=0)
        System.out.println("PlingPlang");
        else if(n%3==0 && n%5!=0 && n%7==0)
        System.out.println("PlingPlong");
        else if(n%3!=0 && n%5==0 && n%7==0)
        System.out.println("PlangPlong");
        else if(n%3==0 && n%5!=0 && n%7!=0)
        System.out.println("Pling");
        else if(n%3!=0 && n%5!=0 && n%7==0)
        System.out.println("Plong");
        else if(n%3!=0 && n%5==0 && n%7!=0)
        System.out.println("Plang");
        else
        System.out.println(n);
        
    }
}