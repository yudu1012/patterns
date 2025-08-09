
public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new CarFactory();
        Transport transport = transportFactory.createTransportFactory();
        transport.drive();

        TransportFactory transportFactory1 = new MotorcycleFactory();
        Transport transport1 = transportFactory1.createTransportFactory();
        transport1.drive();


    }
}