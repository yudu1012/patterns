public class MotorcycleFactory extends TransportFactory{
    @Override
    public Transport createTransportFactory() {
        return new Motorcycle();
    }
}
