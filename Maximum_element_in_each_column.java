import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int r=t.nextInt(),c=t.nextInt();
        int a[][]=new int[100][100];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=t.nextInt();
            }
        }
        for(int i=0;i<c;i++)
        {
            int m=0;
            for(int j=0;j<r;j++)
            {
                if(a[j][i]>m)
                m=a[j][i];
            }
            System.out.println(m);
        }
        
    }
}