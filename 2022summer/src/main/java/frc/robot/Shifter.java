package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Shifter {

    private DoubleSolenoid solenoid;
    
    public Shifter(DoubleSolenoid newSolenoid){
        solenoid = newSolenoid;
    }

    public void setPower(){
        solenoid.set(Value.kForward);
    }

    public void setSpeed(){
        solenoid.set(Value.kReverse);
    }

}
