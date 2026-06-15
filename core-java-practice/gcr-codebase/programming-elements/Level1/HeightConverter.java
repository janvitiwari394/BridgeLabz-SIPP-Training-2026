public class HeightConverter {
    public static void main(String[] args) {

        double height = 170; // cm

        double totalInches = height / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your height in cm is " + height +
                           " while in feet is " + feet +
                           " and inches is " + inches);
    }
}