class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;

        System.out.println("The volume of Earth in cubic kilometers is " + volume);
    }
}
