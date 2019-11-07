class Point {

    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getLength(Point next) {
        double dx = Math.abs(this.x - next.x);
        double dy = Math.abs(this.y - next.y);
        return Math.hypot(dx, dy);
    }
}