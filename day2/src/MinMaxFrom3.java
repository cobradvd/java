import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cobra on 23.08.2016.
 * Найти среди 3х чисел максимальное и минимальное
 */
public class MinMaxFrom3 {


        public static int min ( int a, int b, int c){
            int m = a;
            if (b < m)
                m = b;
            if (c < m)
                m = c;
            return m;
        }
        public static int max ( int a, int b, int c){
            int m = a;
            if (b > m)
            m = b;
            if (c > m)
            m = c;
            return m;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1 = reader.readLine();
        int n1 = Integer.parseInt(d1);
        String d2 = reader.readLine();
        int n2 = Integer.parseInt(d2);
        String d3 = reader.readLine();
        int n3 = Integer.parseInt(d3);
        System.out.println("min:" + min(n1, n2, n3));
        System.out.println("max:" + max(n1, n2, n3));
    }

}
