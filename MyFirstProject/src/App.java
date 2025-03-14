import java.text.NumberFormat;
import java.util.Scanner;

// import java.text.NumberFormat;j
// import java.util.Scanner;

// import java.util.Arrays;

// import java.util.Date;

public class App {

    public static void main(String[] args) throws Exception {
        // byte age = 30;
        // int viewCount = 3_233_222;
        // float price = 10.99F;
        // char A = 'B';
        // Date bb = new Date();
        // System.out.println(bb);

        // String message = "c:\\Wimdow\\...";
        // System.out.println(message);

        // array
        // int[] numbers = new int[5];
        // numbers[0]=1;
        // numbers[1]=2;
        // int[] numbers = {2,5,3,4,0,1};
        // System.out.println(numbers.length);

        // System.out.println(Arrays.toString(numbers));

        // int result = 10 -4;
        // result++;
        // System.out.println(result);

        // Implicit casting
        // byte > short > int > long > float > double
        // String x = "1";
        // int y =  Integer.parseInt(x) +2 ;
        // System.out.println(y);

        // Math Methon
        // int result = (int) Math.round(Math.random()*100);
        // int result = (int) (Math.random()*100);
        // System.out.println(result);

        // Number  Format
        // String result = NumberFormat.getCurrencyInstance().format(1223323);
        // System.out.println(result);

        // Read Input
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
        // String name = scanner.nextLine().trim();
        // System.out.println("You are "+name);

        // double result =Math.pow(1, 3);
        // System.out.println(result);

        // Mortgage Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Rate:");
        float rate = scanner.nextFloat();
        float Monthly_Interest = rate /100 /12;
        System.out.print("Period (Years): ");
        byte year = scanner.nextByte();
        int Month_Of_Payment = year *12;

        double mortgage = principal 
        * (Monthly_Interest*Math.pow(1+Monthly_Interest, Month_Of_Payment))
        /(Math.pow(1+Monthly_Interest, Month_Of_Payment)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }
}
