import factory.RegularTransportFactory;
import factory.SportTransportFactory;
import factory.TransportFactory;
import land.LandTransport;
import water.WaterTransport;

public class Main {
    public static void main(String[] args) {

        TransportFactory transportFactory1 = new RegularTransportFactory();
        LandTransport landTransport1 = transportFactory1.createTransportFactory();
        WaterTransport waterTransport = transportFactory1.createWaterTransport();
        landTransport1.drive();
        waterTransport.sail();
        TransportFactory transportFactory2 = new SportTransportFactory();
        LandTransport landTransport2 = transportFactory2.createTransportFactory();
        WaterTransport waterTransport2 = transportFactory2.createWaterTransport();
        landTransport2.drive();
        waterTransport2.sail();
    }
}