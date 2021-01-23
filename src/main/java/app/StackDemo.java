package app;
import stack.StringStack;

public class StackDemo {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        StringStack stack = new StringStack();
        for(int i = 0; i < str.length(); i++){
            String letter = str.charAt(i) + "";
            stack.push(letter);
        }
        String reversedStr = "";
        while(!stack.isEmpty()){
            String letter = stack.pop();
            reversedStr = reversedStr + letter;
        }
        System.out.println(reversedStr);
        StringBuilder stringBuilder = new StringBuilder("ABCDEFG");
        stringBuilder.append("HIJ");
        stringBuilder.insert(0,"XX");
        System.out.println(stringBuilder.charAt(0));
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse());

        System.out.println(69 +"A");
        System.out.println((char)(69)+"A");
        System.out.println(1+1+"cos");
        System.out.println("cos"+1+1);
    }
}
