package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Intake {

    private MotorController greenRollers;
    private MotorController sushiRollers;
    private MotorController arm;

    private DigitalInput limitSwitch;
    private DigitalInput beamSensor;
    private SingleChannelEncoder armEncoder;
    
    public Intake(MotorController newGreen, MotorController newSushi, MotorController newArm, SingleChannelEncoder newEnc, DigitalInput newLimitSwitch, DigitalInput newSensor){
        greenRollers = newGreen;
        sushiRollers = newSushi;
        arm = newArm;

        armEncoder = newEnc;
        limitSwitch = newLimitSwitch;
        beamSensor = newSensor;
    }

    /*      INTAKE CLASS (26 methods total)
        1. Check if there is a cargo at beamSensor (DigitalInput)
        2. Check if limit switch is pressed (Digital Input)
        3. Check if encoder reads a value less than limit to extend down
        4. Check if encoder reads a value greater than limit to retract up
        5. Check if encoder reads a value greater than the midway point
        6. Run Method (using 2 switch-case statements, one for each enumeration)

    */

    /*      GREEN AND SUSHI ROLLER STATES
        INTAKING Mode: set speed of green (-) and sushi rollers (+)
        OUTTAKING Mode: set speed of green (+) and sushi rollers (-)
        FEEDING Mode: set speed of sushi rollers
        STOP Mode: stop green and sushi rollers
        TESTING Mode: empty method
    */

    /*      ARM STATES
        EXTEND Mode: set speed of arm (+)
            if limit switch is not pressed OR encoder is less than 0,
            extend down
        RETRACT Mode: set speed of arm (-)
            if encoder is greater than -150, retract up
        MIDWAY Mode: set speed of arm (+)
            if encoder is greater than -75, retract up
        STOP Mode: stop the arm
        TESTING Mode: empty method
    */

}
