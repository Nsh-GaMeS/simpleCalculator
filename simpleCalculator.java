import java.util.Scanner;

class Main {
    static int num1;
    static int num2;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("This is a simple calculator app to do simple arithmatics.");
        System.out.print("Enter your first(1) number here: ");

        num1 = console.nextInt();
        System.out.print("Enter your second(2) number here: ");
        num2 = console.nextInt();
        System.out.println("choose your operation(+-/)");
        while (true) {
            if (console.hasNext()) {
                String op = console.next();
                int ans = checkOperation(op);
                if (ans != 0) {
                    System.out.print("Your answer is " + ans);
                } else {
                    System.out.println("kill you self" + " error code " + ans);
                }

            } else {
                System.out.println("you fucking ojibwe monkey");
            }
        }
    }

    public static int checkOperation(String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}