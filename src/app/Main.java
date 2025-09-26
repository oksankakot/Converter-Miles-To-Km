package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers.");

        double milesValue = 36;
        double kilometersResult = convMilesToKilometers(milesValue);
        System.out.println("Result of conversion of " + milesValue +  " miles is " + kilometersResult + " kilometers.");
    }

    private static double convMilesToKilometers(double mls) {
        return mls * CONV_K;
    }




}
