import java.util.Scanner;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        a[i]=t.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j && a[j]!=-100)
                {
                    flag=1;
                    a[i]=-100;
                    break;
                }
            }
            if(flag==1)
            {
                c++;
            }
        }
        System.out.println(n+c);
    }
}