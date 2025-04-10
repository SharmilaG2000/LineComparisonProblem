public class LineComparison {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to Line Comparison Computation Program");

        // Coordinates for Line 1
        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;

        // Coordinates for Line 2
        int a1 = 0, b1 = 0;
        int a2 = 3, b2 = 4;

        // Calculate lengths of the lines
        Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        // Display lengths
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // Compare the two lengths using compareTo()
        int comparison = length1.compareTo(length2);

        if (comparison == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}
