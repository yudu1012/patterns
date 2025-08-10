
public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new MotorcycleFactory();
        Transport transport = transportFactory.createTransport();
        transport.drive();

        TransportFactory transportFactory1 = new CarFactory();
        Transport transport1 = transportFactory1.createTransport();
        transport1.drive();
    }
}