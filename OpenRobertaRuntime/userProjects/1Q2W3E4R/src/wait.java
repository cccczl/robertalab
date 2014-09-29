package generated.main;

import de.fhg.iais.roberta.ast.syntax.BrickConfiguration;
import de.fhg.iais.roberta.ast.syntax.HardwareComponent;
import de.fhg.iais.roberta.ast.syntax.action.HardwareComponentType;
import de.fhg.iais.roberta.ast.syntax.action.ActorPort;
import de.fhg.iais.roberta.ast.syntax.action.MotorMoveMode;
import de.fhg.iais.roberta.ast.syntax.action.DriveDirection;
import de.fhg.iais.roberta.ast.syntax.action.MotorStopMode;
import de.fhg.iais.roberta.ast.syntax.action.MotorSide;
import de.fhg.iais.roberta.ast.syntax.action.MotorType;
import de.fhg.iais.roberta.ast.syntax.action.TurnDirection;
import de.fhg.iais.roberta.ast.syntax.action.BrickLedColor;
import de.fhg.iais.roberta.ast.syntax.sensor.SensorPort;
import de.fhg.iais.roberta.ast.syntax.sensor.BrickKey;
import de.fhg.iais.roberta.ast.syntax.sensor.ColorSensorMode;
import de.fhg.iais.roberta.ast.syntax.sensor.GyroSensorMode;
import de.fhg.iais.roberta.ast.syntax.sensor.InfraredSensorMode;
import de.fhg.iais.roberta.ast.syntax.sensor.MotorTachoMode;
import de.fhg.iais.roberta.ast.syntax.sensor.SensorsMode;
import de.fhg.iais.roberta.ast.syntax.sensor.TimerSensorMode;
import de.fhg.iais.roberta.ast.syntax.sensor.UltrasonicSensorMode;
import de.fhg.iais.roberta.codegen.lejos.Hal;

public class wait {
    private BrickConfiguration brickConfiguration = new BrickConfiguration.Builder()
    .setWheelDiameter(5.6)
    .setTrackWidth(13.0)
    .addActor(ActorPort.A, new HardwareComponent(HardwareComponentType.EV3LargeRegulatedMotor, DriveDirection.FOREWARD, MotorSide.LEFT))
    .addActor(ActorPort.B, new HardwareComponent(HardwareComponentType.EV3LargeRegulatedMotor, DriveDirection.FOREWARD, MotorSide.RIGHT))
    .addSensor(SensorPort.S1, new HardwareComponent(HardwareComponentType.EV3ColorSensor))
    .addSensor(SensorPort.S2, new HardwareComponent(HardwareComponentType.EV3TouchSensor))
    .build();

    public static void main(String[] args) {
        new wait().run();
    }

    public void run() {
        Hal hal = new Hal(brickConfiguration);
        while ( true ) {
            if ( hal.isPressed(SensorPort.S2) == true ) {
break;
            }
        }
        hal.driveDistance(ActorPort.A, ActorPort.B, false, DriveDirection.FOREWARD, 50, 30);
        try {
            Thread.sleep(2000);
        } catch ( InterruptedException e ) {
            // ok
        }
    }
}
