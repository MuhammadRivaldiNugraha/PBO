public class KonversiSuhu {
    public static void main(String[] args) {
        double c = 10;
        double f = 15;
        double r = 5;

        double hasil1 = (c * 9 / 5) + 32;
        System.out.println("Celcius ke Fahrenheit = " + hasil1);

        double hasil2 = (f - 32) * 5 / 9;
        System.out.println("Fahrenheit ke Celcius = " + hasil2);

        double hasil3 = c * 4 / 5;
        System.out.println("Celcius ke Reamur = " + hasil3);

        double hasil4 = r * 5 / 4;
        System.out.println("Reamur ke Celcius = " + hasil4);

        double hasil5 = (f - 32) * 4 / 9;
        System.out.println("Fahrenheit ke Reamur = " + hasil5);

        double hasil6 = (r * 9 / 4) + 32;
        System.out.println("Reamur ke Fahrenheit = " + hasil6);
    }
}