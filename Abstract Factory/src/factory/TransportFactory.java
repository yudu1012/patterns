package factory;

import land.LandTransport;
import water.WaterTransport;

public interface TransportFactory {
    LandTransport createTransportFactory();
    WaterTransport createWaterTransport();
}
