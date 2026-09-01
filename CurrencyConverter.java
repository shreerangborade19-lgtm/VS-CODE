import java.util.Scanner;

public class CurrencyConverter {

    static double inrToUSD(double inr) {
        return inr * 0.0117;
    }

    static double inrToGBP(double inr) {
        return inr * 0.0018
    static double inrToEUR(double inr) {
        return inr * 0.0100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.println("USD = $" + inrToUSD(inr));
        System.out.println("GBP = £" + inrToGBP(inr));
        System.out.println("EUR = €" + inrToEUR(inr));

        sc.close();
    }
}