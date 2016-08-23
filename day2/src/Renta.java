import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cobra on 23.08.2016.
 * Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
 * что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней,
 * он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
 */
public class Renta {
    public static int Day ( int a){
        int m = a*40;
        if (a > 5 && a < 8) m = m-20;
        if (a > 7) m = m-50;
       return m;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1 = reader.readLine();
        int n1 = Integer.parseInt(d1);
        System.out.println("Renta: " + Day (n1));
    }
}
