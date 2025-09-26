package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers and vice versa.");

        double milesValue = 36;
        double kilometersValue = 15;
        double kilometersResult = convMilesToKilometers(milesValue);
        double milesResult = convKilometersToMiles(kilometersValue);
        System.out.println("Result of conversion of " + milesValue +  " miles is "
                + kilometersResult + " kilometers.");
        System.out.println("Result of conversion of " + kilometersValue +
                " kilometers is " + milesResult + " miles.");
    }

    private static double convMilesToKilometers(double mls) {
        return mls * CONV_K;
    }

    private static double convKilometersToMiles(double kms) {
        return kms / CONV_K;
    }




}
