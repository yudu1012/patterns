package factory;

import land.Car;
import land.LandTransport;
import water.Boat;
import water.WaterTransport;

public class RegularTransportFactory implements TransportFactory{
    @Override
    public WaterTransport createWaterTransport() {
        return new Boat();
    }

    @Override
    public LandTransport createTransportFactory() {
        return new Car();
    }
}
