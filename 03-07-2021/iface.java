import java.util.Scanner;

interface temperature {
    public float temp(float t);
}
 class fahrenheitcelsius implements temperature {

    @Override
    public float temp(float t) {
        t = ((t - 32) * 5) / 9;
        return t;
    }
}

public class Iface {
    public static void main(String[] args) {
        System.out.println("enter the temperature in fahrenheit scale- ");
        Scanner scan = new Scanner(System.in);
        float t = scan.nextFloat();

        temperature conver = new fahrenheitcelsius();
        float celsius = conver.temp(t);
        System.out.println("temperature in celsius scale is- " + celsius);
    }
}
