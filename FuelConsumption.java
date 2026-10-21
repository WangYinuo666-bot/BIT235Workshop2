public class FuelConsumption {
    public static void main(String[] args) {
        // Fuel usage on a normal road: 8 liters per 100 kilometers
        double normalFuelPer100km = 8.0;

        // Fuel usage on a rough road is 15% more
        double roughFuelPer100km = normalFuelPer100km * 1.15;

        // Full tank capacity
        double tankCapacity = 40.0;

        // Distance = (tank capacity / fuel used per 100km) * 100
        double normalDistance = (tankCapacity / normalFuelPer100km) * 100.0;
        double roughDistance = (tankCapacity / roughFuelPer100km) * 100.0;

        // Display the results
        System.out.println("Fuel consumption on a normal road: " + normalFuelPer100km + " liters per 100 km");
        System.out.println("Fuel consumption on a rough road:  " + roughFuelPer100km + " liters per 100 km");
        System.out.println("With a full tank of " + tankCapacity + " liters, the car can travel:");
        System.out.println(normalDistance + " km on a normal road");
        System.out.println(roughDistance + " km on a rough road");
    }
}
