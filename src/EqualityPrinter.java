public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (isNegative(num1, num2, num3)) {
            System.out.println("Invalid Value");
        }else if(num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num3 != num2 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

    public static boolean isNegative(int num1, int num2, int num3) {
        if (num1 < 0) {
            return true;
        } else if (num2 < 0) {
            return true;
        } else return num3 < 0;
    }
}
