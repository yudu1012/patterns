package factory;

import land.LandTransport;
import land.Motorcycle;
import water.Ship;
import water.WaterTransport;

public class SportTransportFactory implements TransportFactory{
    @Override
    public LandTransport createTransportFactory() {
        return new Motorcycle();
    }

    @Override
    public WaterTransport createWaterTransport() {
        return new Ship();
    }
}
