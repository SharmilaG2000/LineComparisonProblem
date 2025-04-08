public class LineComparison {
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("Welcome to Line Comparison Computation Program");

        // Coordinates of the first point (x1, y1)
        int x1 = 1;
        int y1 = 2;

        // Coordinates of the second point (x2, y2)
        int x2 = 4;
        int y2 = 6;

        // Calculate the length using the distance formula:
        // Length = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Display the result
        System.out.println("Length of the line is: " + length);
    }
}
