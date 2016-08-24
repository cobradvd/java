import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cobra on 24.08.2016.
 * 1. Создайте калькулятор, который выполняет, базовые арифметические операции:
 * - умножение;
 * - деление;
 * - сложение;
 * - вычитание;
 * - остаток от деления (%);
 * - нахождение модуля числа (можно использовать Math.abs)
 * входные данные здесь можно представить как:
 * String operation = "addition";
 * int firstOperand = 15;
 * int secondOperand = 12;
 */
public class calculator {
        public static int multiply ( int firstOperand, int secondOperand) {
            int otvet = firstOperand * secondOperand;
            return otvet;
        }
        public static int share ( int firstOperand, int secondOperand){
            int otvet = firstOperand / secondOperand;
            return otvet;
        }
        public static int add ( int firstOperand, int secondOperand){
            int otvet = firstOperand + secondOperand;
            return otvet;
        }
        public static int deduct ( int firstOperand, int secondOperand){
            int otvet = firstOperand - secondOperand;
            return otvet;
        }
        public static int ostatok ( int firstOperand, int secondOperand){
            int otvet = firstOperand % secondOperand;
            return otvet;
        }
        public static int modul ( int firstOperand){
            int otvet =0;
            if (firstOperand < 0 )
                otvet = firstOperand * -1;
            else otvet = firstOperand;
            return otvet;
            }
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число:");
            String firstOperandStroka = reader.readLine();
            int firstOperand = Integer.parseInt(firstOperandStroka);
            System.out.println("Введите операцию("+
                    "- умножение;\n" +
                    "- деление;\n" +
                    "- сложение;\n" +
                    "- вычитание;\n" +
                    "- остаток от деления;\n" +
                    "- модуль числа):");
            String operation = reader.readLine();
            switch (operation) {
            case "умножение":
                System.out.println("Введите второе число:");
                String secondOperandStroka = reader.readLine();
                int secondOperand = Integer.parseInt(secondOperandStroka);
                System.out.println("Otvet " + multiply(firstOperand,secondOperand));
                break;
            case "деление":
                System.out.println("Введите второе число:");
                secondOperandStroka = reader.readLine();
                secondOperand = Integer.parseInt(secondOperandStroka);
                System.out.println("Otvet " + share(firstOperand,secondOperand));
                break;
            case "сложение":
                System.out.println("Введите второе число:");
                secondOperandStroka = reader.readLine();
                secondOperand = Integer.parseInt(secondOperandStroka);
                System.out.println("Otvet " + add(firstOperand,secondOperand));
                break;
                case "вычитание":
                System.out.println("Введите второе число:");
                secondOperandStroka = reader.readLine();
                secondOperand = Integer.parseInt(secondOperandStroka);
                System.out.println("Otvet " + deduct(firstOperand,secondOperand));
                break;
                case "остаток от деления":
                System.out.println("Введите второе число:");
                secondOperandStroka = reader.readLine();
                secondOperand = Integer.parseInt(secondOperandStroka);
                System.out.println("Otvet " + ostatok(firstOperand,secondOperand));
                break;
                case "модуль числа":
                System.out.println("Otvet " + modul(firstOperand));
                break;
                default:
                System.out.println("Неправильное введение данных!");
        }
    }
}