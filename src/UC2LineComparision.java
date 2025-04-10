public class LineComparison {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome to Line Comparison Computation Program");

        // Coordinates of Line 1: point A (x1, y1) to point B (x2, y2)
        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;

        // Coordinates of Line 2: point C (a1, b1) to point D (a2, b2)
        int a1 = 1, b1 = 2;
        int a2 = 4, b2 = 6;

        // Calculate the lengths of both lines
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        // Display lengths
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // Compare the two lengths using equals()
        if (Double.valueOf(length1).equals(length2)) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are NOT equal in length.");
        }
    }
}
