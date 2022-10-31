import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                f++;
            }
        }
        if(f!=0)
        System.out.printf("Contains %d digit",f);
        else
        System.out.println("Doesn't contain digit");
    }
}