public class MotorcycleFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}
