public class Point {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(Point p) {
        int distanceX = this.x - p.getX();
        int distanceY = this.y - p.getY();
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    public double distance(int a, int b) {
        int distanceX = this.x - a;
        int distanceY = this.y - b;
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }
}
