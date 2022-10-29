import java.util.*;
class manoj{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt(),k=0;
        char s[]=new char[100];
        while(n!=0)
        {
            if(n>=1000)
            {
                s[k++]='M';
                n-=1000;
            }
            else if(n>=900)
            {
                s[k++]='C';
                s[k++]='M';
                n-=900;
            }
            else if(n>=500)
            {
                s[k++]='D';
                n-=500;
            }
            else if(n>=400)
            {
                s[k++]='C';
                s[k++]='D';
                n-=400;
            }
            else if(n>=100)
            {
                s[k++]='C';
                n-=100;
            }
            else if(n>=90)
            {
                s[k++]='X';
                s[k++]='C';
                n-=90;
            }
            else if(n>=50)
            {
                s[k++]='L';
                n-=50;
            }
            else if(n>=40)
            {
                s[k++]='X';
                s[k++]='L';
                n-=40;
            }
            else if(n>=10)
            {
                s[k++]='X';
                n-=10;
            }
            else if(n>=5)
            {
                s[k++]='V';
                n-=5;
            }
            else
            {
                s[k++]='I';
                n-=1;
            }
        }
        for(int i=0;i<k;i++)
        System.out.printf("%c",s[i]);
    }
}