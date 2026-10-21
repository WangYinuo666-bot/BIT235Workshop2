public class SunEarthVolume {
    public static void main(String[] args) {
        // Use 3.14 for pi as instructed
        double pi = 3.14;

        // Diameters in miles
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;

        // Radius = diameter / 2
        double sunRadius = sunDiameter / 2.0;
        double earthRadius = earthDiameter / 2.0;

        // Volume of a sphere = (4/3) * pi * r^3, using Math.pow for the cube
        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        // Ratio of the Sun's volume to the Earth's volume
        double ratio = sunVolume / earthVolume;

        // Display the results
        System.out.println("Volume of the Earth: " + earthVolume + " cubic miles");
        System.out.println("Volume of the Sun:   " + sunVolume + " cubic miles");
        System.out.println("Ratio of the Sun to the Earth: " + ratio);
    }
}
