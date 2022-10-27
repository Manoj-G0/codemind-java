import java.util.*;
class manoj{
    public static int calculate(String s) {
        int sum=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(Character.isDigit(x)){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                num=num*sign;
                sum+=num;
                sign=1;
            }
            else if(x=='('){
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=1;
            }
            else if(x==')'){
                sum*=st.pop();
                sum+=st.pop();
            }
            else if(x=='-'){
                sign*=-1;
            }
            else {
                continue;
            }
        }
        return sum;
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(calculate(s));
        
    }
}
