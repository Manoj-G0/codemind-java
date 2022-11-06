import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        for(int i=s.length()-1;i>=0;i-=2)
        {
            System.out.printf("%c ",s.charAt(i));
        }
        
    }
}