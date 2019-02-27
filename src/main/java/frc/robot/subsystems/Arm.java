/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmDrive;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {

  CANSparkMax armMax;
  CANEncoder armEncoder;
  CANPIDController armPID;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Arm() {
    armMax = new CANSparkMax(1, MotorType.kBrushless); // The Spark MAX is configured to be ID 1
    armEncoder = new CANEncoder(armMax);
    armPID = new CANPIDController(armMax);

    armPID.setP(RobotMap.P);
    armPID.setI(RobotMap.I);
    armPID.setD(RobotMap.D);
    armPID.setIZone(0);
    armPID.setFF(0);
  }

  public double getPosition() {
    return armEncoder.getPosition();
  }

  public double getVelocity() {
    return armEncoder.getVelocity();
  }

  public double getPositionConversionFactor() {
    return armEncoder.getPositionConversionFactor();
  }

  public void setMotorPower(double value) { // Value can be any double from -1.0 to 1.0
    armMax.set(value * RobotMap.speedLimiter); // This speedlimiter exists to stop people from driving the arm at drivetrain speed. Adjust as needed.
  }

  public void setReference(double value) {
    armPID.setReference(value, ControlType.kPosition);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmDrive());
  }
}
