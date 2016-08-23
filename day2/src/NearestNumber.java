import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cobra on 23.08.2016.
 *  Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
 */
public class NearestNumber {
    public static int nearest ( int a, int b) {
        int m = 10 - a;
        int d = 10 - b;
        if (m > d) {
            return b;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1 = reader.readLine();
        int n1 = Integer.parseInt(d1);
        String d2 = reader.readLine();
        int n2 = Integer.parseInt(d2);
        System.out.println("Closer " + nearest (n1,n2));
    }
}

