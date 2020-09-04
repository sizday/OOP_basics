class Circle extends Figure implements Printable
{
    private float radius;

    Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getPerimeter() {
        return 2 * 3.14f * radius;
    }

    public float getArea() {
        return 3.14f * radius * radius;
    }

    private float getRadius() { return radius; };

    public void printCoordinate() {
        System.out.println("Coordinate of circle= " + getX() + " " + getY());
    };

    public void printData() {
        System.out.println("Width of circle = " + getRadius());
    }
}
