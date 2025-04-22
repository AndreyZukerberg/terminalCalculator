import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tCalculator\t");
        int x = 0;
        while(x == 0){
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите действие: ");
            String st = scanner.nextLine();
            st = scanner.nextLine();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            switch (st){
                case("-"):
                    int sum = num1 - num2;
                    System.out.println(num1 + " - " + num2);
                    System.out.println("\t=" + sum);
                    System.out.println("\nЕсли вы хотите закончить рассчет, напишите end:");
                    String endd = scanner.nextLine();
                    endd = scanner.nextLine();
                    if(Objects.equals(endd, "end")){
                        x++;
                    }
                    break;
                case("+"):
                    int sum2 = num1 + num2;
                    System.out.println(num1 + " + " + num2);
                    System.out.println("\t=" + sum2);
                    System.out.println("\nЕсли вы хотите закончить рассчет, напишите end:");
                    endd = scanner.nextLine();
                    endd = scanner.nextLine();
                    if(Objects.equals(endd, "end")){
                        x++;
                    }
                    break;
                case("*"):
                    int sum3 = num1 * num2;
                    System.out.println(num1 + " * " + num2);
                    System.out.println("\t=" + sum3);
                    System.out.println("\nЕсли вы хотите закончить рассчет, напишите end:");
                    endd = scanner.nextLine();
                    endd = scanner.nextLine();
                    if(Objects.equals(endd, "end")){
                        x++;
                    }
                    break;
                case("/"):
                    int sum4 = num1 / num2;
                    System.out.println(num1 + " / " + num2);
                    System.out.println("\t=" + sum4);
                    System.out.println("\nЕсли вы хотите закончить рассчет, напишите end:");
                    endd = scanner.nextLine();
                    endd = scanner.nextLine();
                    if(Objects.equals(endd, "end")){
                        x++;
                    }
                    break;
                case("%"):
                    int sum5 = num1 % num2;
                    System.out.println(num1 + " % " + num2);
                    System.out.println("\t=" + sum5);
                    System.out.println("\nЕсли вы хотите закончить рассчет, напишите end:");
                    endd = scanner.nextLine();
                    endd = scanner.nextLine();
                    if(Objects.equals(endd, "end")){
                        x++;
                    }
                    break;
                default:
                    System.out.println("Где-то произошла ошибка, попробуйте попозже пожалуйста");
            }
        }
    }
}