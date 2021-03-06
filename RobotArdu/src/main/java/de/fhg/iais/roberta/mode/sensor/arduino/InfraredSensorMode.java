package de.fhg.iais.roberta.mode.sensor.arduino;

import de.fhg.iais.roberta.inter.mode.sensor.IInfraredSensorMode;

public enum InfraredSensorMode implements IInfraredSensorMode {
    OBSTACLE( "getInfraredSensorDistance", "Distance" ), SEEK( "getInfraredSensorSeek", "Seek" );

    private final String[] values;
    private final String halJavaMethodName;

    private InfraredSensorMode(String halJavaMethodName, String... values) {
        this.halJavaMethodName = halJavaMethodName;
        this.values = values;
    }

    /**
     * @return name that Lejos is using for this mode
     */
    public String getLejosModeName() {
        return values[0];
    }

    //    @Override
    //    public String getHalJavaMethod() {
    //        return this.halJavaMethodName;
    //    }

    @Override
    public String[] getValues() {
        return values;
    }

}