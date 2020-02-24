import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String arr[]){
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Введите комбинацию скобок: ");
        s=in.nextLine();
        char []arrOfString=s.toCharArray();
        Stack stack=new Stack<Character>();
        if(arrOfString[0]==')' || arrOfString[0]==']' || arrOfString[0]=='}' || arrOfString.length % 2 !=0) {
            System.out.println("Неправильная комбинация");
            return;
        }
        for(int i=0;i<arrOfString.length;i++)
        {
            switch (arrOfString[i]){
                case '(' : stack.push(arrOfString[i]); break;
                case '[' : stack.push(arrOfString[i]); break;
                case '{' :stack.push(arrOfString[i]); break;
                case ')' : {
                    if (stack.size()!=0) {
                        if (stack.peek().equals('('))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
                case '}' : {
                    if(stack.size()!=0) {
                        if (stack.peek().equals('{'))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
                case ']' : {
                    if(stack.size()!=0) {
                        if (stack.peek().equals('['))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
            }
        }
        if(stack.size()==0)
            System.out.println("Правильная комбинация");
        else
            System.out.println("Неправильная комбинация");
    }
}
