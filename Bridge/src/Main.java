public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new RedColor());
        Shape shape2 = new Square(new Blue());
        shape1.draw();
        shape2.draw();
    }
}
