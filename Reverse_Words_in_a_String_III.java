import java.util.Scanner;
class manoj{
    public static boolean isvowel(String s,int i,int j){
        int c=0;
        for(int k=i;k<j;k++)
        {
            if(s.charAt(k)=='a'|| s.charAt(k)=='e'|| s.charAt(k)=='i'|| s.charAt(k)=='o'|| s.charAt(k)=='u')
            {
                c++;
            }
        }
        if(c==j-i)
        return true;
        return false;
    }
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int c=0;
        int a[]=new int[100];
        a[0]=0;
        int k=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                a[k++]=i;
            }
        }
        a[k++]=s.length()-1;
        String str="";
        for(int i=0;i<k-1;i++)
        {
            if(i==0)
            {
                for(int j=a[i+1]-1;j>=a[i];j--)
                {
                    str+=s.charAt(j);
                }
                str+=" ";
            }
            else if (i!=k-2)
            {
                for(int j=a[i+1]-1;j>a[i];j--)
                {
                    str+=s.charAt(j);
                }
                str+=" ";
            }
            else
            {
                for(int j=a[i+1];j>a[i];j--)
                {
                    str+=s.charAt(j);
                }
            }
        }
        System.out.println(str);
    }
}