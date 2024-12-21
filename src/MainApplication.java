// MainApplication.java

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Circle> circles = new ArrayList<>();
    List<Cylinder> cylinders = new ArrayList<>();

    int maxEntries = 5; // Limit the number of entries

    System.out.println("Enter the number of circles (max " + maxEntries + "):");
    int circleCount = Math.min(scanner.nextInt(), maxEntries);
    for (int i = 0; i < circleCount; i++) {
        System.out.println("Enter radius for circle " + (i + 1) + ":");
        double radius = scanner.nextDouble();
        circles.add(new Circle(radius));
    }

    System.out.println("Enter the number of cylinders (max " + maxEntries + "):");
    int cylinderCount = Math.min(scanner.nextInt(), maxEntries);
    for (int i = 0; i < cylinderCount; i++) {
        System.out.println("Enter radius for cylinder " + (i + 1) + ":");
        double radius = scanner.nextDouble();
        System.out.println("Enter height for cylinder " + (i + 1) + ":");
        double height = scanner.nextDouble();
        cylinders.add(new Cylinder(radius, height));
    }

    System.out.println("\nCircles:");
    for (Circle circle : circles) {
        System.out.println(circle);
        System.out.println("Circumference: " + circle.circumference());
        System.out.println("Area: " + circle.area());
    }

    System.out.println("\nCylinders:");
    for (Cylinder cylinder : cylinders) {
        System.out.println(cylinder);
        System.out.println("Surface Area: " + cylinder.surfaceArea());
        System.out.println("Volume: " + cylinder.volume());
    }

    scanner.close();
}
