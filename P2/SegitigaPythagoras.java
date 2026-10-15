public class SegitigaPythagoras {
    public static void main(String[] args) {

        double a = 6;
        double b = 8;

        double c = Math.sqrt(a * a + b * b);

        double keliling = a + b + c;

        System.out.println("Sisi c = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}