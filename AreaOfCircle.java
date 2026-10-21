public class AreaOfCircle {
    public static void main(String[] args) {
        // Use 3.14 for pi as instructed
        double pi = 3.14;

        // Test the program with several different values for the radius
        double[] radii = { 1.0, 5.0, 7.5, 10.0 };

        for (double radius : radii) {
            // Area = pi * radius^2, using Math.pow to calculate the square
            double area = pi * Math.pow(radius, 2);

            // Display the result
            System.out.println("The area of a circle with radius " + radius + " is " + area);
        }
    }
}
