package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drive{

    private MotorControllerGroup left;
    private MotorControllerGroup right;
    private DifferentialDrive diffDrive;

    public Drive(MotorController fl, MotorController bl, MotorController fr, MotorController br){
        left = new MotorControllerGroup(fl, bl);
        right = new MotorControllerGroup(fr, br);
        diffDrive = new DifferentialDrive(left, right);
    }

    public double deadzone(double dValue){
        return Math.abs(dValue) > 0.02 ? dValue : 0;
    }

    public void tank(double dLeft, double dRight){
        diffDrive.tankDrive(dLeft, dRight);
    }

    public void arcade(double dXSpeed, double dYSpeed){
        diffDrive.arcadeDrive(dXSpeed, dYSpeed);
    }

    public void tankRun(double dLeft, double dRight){
        diffDrive.tankDrive(deadzone(dLeft), deadzone(dRight));
    }

    public void arcadeRun(double dXSpeed, double dYSpeed){
        diffDrive.arcadeDrive(deadzone(dXSpeed), deadzone(dYSpeed));
    }

}