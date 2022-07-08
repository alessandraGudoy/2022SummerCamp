package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Pivot {

    private MotorController pivot;
    private DigitalInput frontSwitch;
    private DigitalInput backSwitch;

    private final double speed = 0.5;

    public Pivot(MotorController newPivot, DigitalInput fSwitch, DigitalInput bSwitch){
        pivot = newPivot;
        frontSwitch = fSwitch;
        backSwitch = bSwitch;
    }

    public enum pivotStates {
        INWARD, OUTWARD, STOP, TESTING
    }

    private pivotStates pivotMode = pivotStates.STOP;

    public void setInward(){
        pivotMode = pivotStates.INWARD;
    }

    public void setOutward(){
        pivotMode = pivotStates.OUTWARD;
    }

    public void setStop(){
        pivotMode = pivotStates.STOP;
    }

    public void setTesting(){
        pivotMode = pivotStates.TESTING;
    }

    public boolean getFrontSwitch(){
        return frontSwitch.get();
    }

    public boolean getBackSwitch(){
        return backSwitch.get();
    }    

    public void inward(){
        pivot.set(-speed);
    }

    public void outward(){
        pivot.set(speed);
    }

    public void stop(){
        pivot.set(0);
    }

    public void testing(){}

    public void run(){
        switch(pivotMode){
            case INWARD:
                inward();
            break;

            case OUTWARD:
                outward();
            break;

            case STOP:
                stop();
            break;

            case TESTING:
                testing();
            break;
        }
    }

}