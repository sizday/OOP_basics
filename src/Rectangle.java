class Rectangle extends Figure implements Printable
{
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){
        return width * 2 + height * 2;
    }

    public float getArea() {
        return width * height;
    }

    private float getWidth() { return width; };

    private float getHeight() { return height; };

    public void printCoordinate() {
        System.out.println("Coordinate of rectangle = " + getX() + " " + getY());
    };

    public void printData() {
        System.out.println("Width of rectangle = " + getWidth());
        System.out.println("Height of rectangle = " + getHeight());
    }
}
