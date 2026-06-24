public class UnitConvertor2 {
    static double yardsToFeet(double yards) { return yards * 3; }
    static double feetToYards(double feet) { return feet * 0.333333; }
    static double metersToInches(double meters) { return meters * 39.3701; }
    static double inchesToMeters(double inches) { return inches * 0.0254; }
    static double inchesToCm(double inches) { return inches * 2.54; }

    public static void main(String[] args) {
        System.out.println(yardsToFeet(5));
        System.out.println(feetToYards(12));
    }
}