public class Main {
    public static void main(String[] args) {
        Figure Rectangle1 = new Rectangle(12, 0, 2.3f, 3.2f);
        Figure Circle1 = new Circle(1,3,3.5f);
        System.out.println(Rectangle1.getArea());
        System.out.println(Circle1.getPerimeter());
        Printable printable1 = new Rectangle(10, 5, 1.9f, 5.8f);
        printable1.printCoordinate();
        Printable printable2 = new Circle(0,0,5.5f);
        printable2.printData();
    }
}
