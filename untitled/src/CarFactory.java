public class CarFactory extends TransportFactory{
    @Override
    public Transport createTransportFactory() {
        return new Car();
    }
}
