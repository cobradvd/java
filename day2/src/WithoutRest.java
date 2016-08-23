import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by cobra on 23.08.2016.
 *  Даны 2 числа, определить делится ли первое число на второе без остатка
 */
public class WithoutRest {
    public static String rest ( int a, int b){
        int m = a%b;
        String e = "Yes";
        String f = "No";
        String d = "null";
        if (m > 0) d = e;
        else d = f;
        return d;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1 = reader.readLine();
        int n1 = Integer.parseInt(d1);
        String d2 = reader.readLine();
        int n2 = Integer.parseInt(d2);
        System.out.println("Ostatok " + rest (n1,n2));
    }
}
