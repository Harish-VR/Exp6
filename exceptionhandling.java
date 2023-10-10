import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Select an exception to trigger (1-4):");
        System.out.println("1. ArithmeticException");
        System.out.println("2. ArrayIndexOutOfBoundsException");
        System.out.println("3. StringIndexOutOfBoundsException");
        System.out.println("4. NumberFormatException");
        int choice = sc.nextInt();
        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    float f = a / b;
                    System.out.println(f);
                    break;
                case 2:
                    int[] c = {9, 8, 7, 6};
                    c[5] = 10;
                    break;
                case 3:
                    String s = "Hello Java";
                    System.out.println(s.substring(13));
                    break;
                case 4:
                    String n = "abcd";
                    int i = Integer.parseInt(n);
                    System.out.println(i);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } catch (ArithmeticException ae) {
            System.err.println("Arithmetic exception occurred.");
        } catch (ArrayIndexOutOfBoundsException are) {
            System.err.println("Array index out of bound exception occurred.");
        } catch (StringIndexOutOfBoundsException ste) {
            System.err.println("String index out of bound exception occurred.");
        } catch (NumberFormatException nue) {
            System.err.println("Number format exception occurred.");
        } finally {
            System.out.println("Your program is exception handled.");
        }
    }
}
