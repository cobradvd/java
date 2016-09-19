package hillel.calc.com.ua;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 Created by cobra on 24.08.2016.
 1. Создайте калькулятор, который выполняет, базовые арифметические операции:
 - умножение;
 - деление;
 - сложение;
 - вычитание;
 - остаток от деления (%);
 - нахождение модуля числа (можно использовать Math.abs)
 входные данные здесь можно представить как:
 String operation = "addition";
 int firstOperand = 15;
 int secondOperand = 12;
 Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
 (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).

 */
public class Calc {

    public static int give(String operation, int firstOperand, int secondOperand) {
        int ver = 000;
        switch (operation) {
            case "*":
                return multiply(firstOperand, secondOperand);
            case "/":
                return share(firstOperand, secondOperand);
            case "+":
                return add(firstOperand, secondOperand);
            case "-":
                return deduct(firstOperand, secondOperand);
            case "%":
                return ostatok(firstOperand, secondOperand);
            default:
                System.out.println("Неправильное введение данных!");
        }

        return ver;
    }

    public static int multiply(int firstOperand, int secondOperand) {
        int otvet = firstOperand * secondOperand;
        return otvet;
    }

    public static int share(int firstOperand, int secondOperand) {
        int otvet = firstOperand / secondOperand;
        return otvet;
    }

    public static int add(int firstOperand, int secondOperand) {
        int otvet = firstOperand + secondOperand;
        return otvet;
    }

    public static int deduct(int firstOperand, int secondOperand) {
        int otvet = firstOperand - secondOperand;
        return otvet;
    }

    public static int ostatok(int firstOperand, int secondOperand) {
        int otvet = firstOperand % secondOperand;
        return otvet;
    }

    public static int modul(int firstOperand) {
        int otvet = 0;
        if (firstOperand < 0)
            otvet = firstOperand * -1;
        else otvet = firstOperand;
        return otvet;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (args.length == 0) {
            System.out.println("Введите операцию(" +
                    "* - умножение;\n" +
                    "/ - деление;\n" +
                    "+ - сложение;\n" +
                    "- - вычитание;\n" +
                    "% - остаток от деления;\n" +
                    "mod - модуль числа):");
            String operation = reader.readLine();
            if ("*".equals(operation) | "/".equals(operation) | "+".equals(operation) | "-".equals(operation) | "%".equals(operation) | "mod".equals(operation)) {
                System.out.println("Введите число:");
                String firstOperandStroka = reader.readLine();
                int firstOperand = Integer.parseInt(firstOperandStroka);
                if (operation.equals("mod"))
                    System.out.println("Otvet: " + modul(firstOperand));
                else {
                    System.out.println("Введите второе число:");
                    String secondOperandStroka = reader.readLine();
                    int secondOperand = Integer.parseInt(secondOperandStroka);
                    System.out.println("Otvet: " + give(operation, firstOperand, secondOperand));
                }
            } else System.out.println("Ввод не верен");
        } else {


            if ("*".equals(args[0]) | "/".equals(args[0]) | "+".equals(args[0]) | "-".equals(args[0]) | "%".equals(args[0])) {
                if (args.length == 3) {
                    String firstOperandStrokaConsole = args[1];
                    int firstOperandConsole = Integer.parseInt(firstOperandStrokaConsole);
                    String secondOperandStrokaConsole = args[2];
                    int secondOperandConsole = Integer.parseInt(secondOperandStrokaConsole);
                    System.out.println("Otvet: " + give(args[0], firstOperandConsole, secondOperandConsole));
                } else
                    System.out.println("Вводить надо по очереди через пробел одну из функций: " + "\n" + " (* - умножение; / - деление; + - сложение; - - вычитание; " + " \n " + " % - остаток от деления; mod - модуль числа)" + " \n " + " затем операнд первый через пробел второй.");
            }
            if (args[0].equals("mod")) {
                if (args.length == 2) {
                    String firstOperandStrokaConsole = args[1];
                    int firstOperandConsole = Integer.parseInt(firstOperandStrokaConsole);
                    System.out.println("Otvet: " + modul(firstOperandConsole));
                } else
                    System.out.println("Вводить надо по очереди через пробел функцию: " + "\n" + " (mod - модуль числа)" + " \n " + " затем операнд.");
        }
        System.out.println("Ввод не верен! " +  "\n" + "Вводить надо по очереди через пробел одну из функций: " + "\n" + " (* - умножение; / - деление; + - сложение; - - вычитание;" + "\n" + " % - остаток от деления; mod - модуль числа)" + "\n" + " затем операнд первый  и если нужно через пробел второй!" + "\n");
        }
    }
}