public class Geometry {

    public class Point {
        private int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void displayPoint() {
            System.out.println("Point Coordinates:(" + x + ", " + y + ")");
        }
    }
}
