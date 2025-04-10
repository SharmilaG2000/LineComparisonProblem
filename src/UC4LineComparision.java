// Point class represents a 2D point with x and y coordinates
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line class represents a line between two points
class Line implements Comparable<Line> {
    Point start;
    Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Method to calculate the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2));
    }

    // Override equals to compare lengths of lines
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    // Implement compareTo to compare lengths
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

// Main class
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // Define two lines using Point objects
        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        Line line2 = new Line(new Point(0, 0), new Point(3, 4));

        // Print lengths
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        // Use equals() to check if the lines are the same length
        if (line1.equals(line2)) {
            System.out.println("The lines are equal in length.");
        } else {
            System.out.println("The lines are NOT equal in length.");
        }

        // Use compareTo() to compare which line is longer
        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (result > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}
