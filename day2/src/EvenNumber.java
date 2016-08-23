import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cobra on 23.08.2016.
 * Написать программу, которая проверит, является ли число четным или нечетным
 */
public class EvenNumber {

    public static String even ( int a){
        int m = a%2;
        String e = "odd";
        String b = "even";
        String d = "null";
        if (m > 0) d = e;
        else d = b;
        return d;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1 = reader.readLine();
        int n1 = Integer.parseInt(d1);
        System.out.println("Number " + even (n1));
    }

}

