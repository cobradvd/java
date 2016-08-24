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
        public static int umnog ( int a, int b) {
            int d = a * b;
            return d;
        }
        public static int del ( int a, int b){
            int d = a / b;
            return d;
        }
        public static int summa ( int a, int b){
            int d = a+b;
            return d;
        }
        public static int minus ( int a, int b){
            int d = a - b;
            return d;
        }
        public static int ostat ( int a, int b) {
            int d = a % b;
            return d;
        }
        public static int modul ( int a){
            int d =0;
            if (a < 0 ) d = a * -1;
            else d = a;
            return d;
            }
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число:");
            String d1 = reader.readLine();
            int n1 = Integer.parseInt(d1);
            System.out.println("Введите операцию("+
                    "- умножение;\n" +
                    "- деление;\n" +
                    "- сложение;\n" +
                    "- вычитание;\n" +
                    "- остаток от деления;\n" +
                    "- модуль числа):");
            String d3 = reader.readLine();
            switch (d3) {
            case "умножение":
                System.out.println("Введите второе число:");
                String d2 = reader.readLine();
                int n2 = Integer.parseInt(d2);
                System.out.println("Otvet " + umnog(n1,n2));
                break;
            case "деление":
                System.out.println("Введите второе число:");
                d2 = reader.readLine();
                n2 = Integer.parseInt(d2);
                System.out.println("Otvet " + del(n1,n2));
                break;
            case "сложение":
                System.out.println("Введите второе число:");
                d2 = reader.readLine();
                n2 = Integer.parseInt(d2);
                System.out.println("Otvet " + summa(n1,n2));
                break;
                case "вычитание":
                 System.out.println("Введите второе число:");
                 d2 = reader.readLine();
                 n2 = Integer.parseInt(d2);
                 System.out.println("Otvet " + minus(n1,n2));
                break;
                case "остаток от деления":
                System.out.println("Введите второе число:");
                d2 = reader.readLine();
                n2 = Integer.parseInt(d2);
                System.out.println("Otvet " + ostat(n1,n2));
                break;
                case "модуль числа":
                System.out.println("Otvet " + modul(n1));
                break;
                default:
                System.out.println("Неправильное введение данных!");
        }
    }
}