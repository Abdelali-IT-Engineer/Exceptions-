public class NestedExample {

    public static void main (String[] args){
        System.out.println(parseAndDivide("10", "2"));
        System.out.println(parseAndDivide("ten", "2"));
        System.out.println(parseAndDivide("10", "0"));
    }
    public static String parseAndDivide(String num1, String num2){
        try{
            try{
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                return String.valueOf(n1 / n2);
            } catch (NumberFormatException e){
                return "Invalid input. Please enter valid numbers.";
            }
        } catch (ArithmeticException e){
            return "Cannot divide by zero.";
        }
    }
}