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
import frc.robot.commands.ClimberDrive;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {

  private CANSparkMax front, back;
  private CANEncoder frontEncoder, backEncoder;
  private CANPIDController frontPID, backPID;

  public Climber() {
    front = new CANSparkMax(RobotMap.climberFront, MotorType.kBrushless);
    back = new CANSparkMax(RobotMap.climberBack, MotorType.kBrushless);

    frontEncoder = new CANEncoder(front);
    backEncoder = new CANEncoder(back);

    frontPID = new CANPIDController(front);
    backPID = new CANPIDController(back);
    
    frontPID.setP(RobotMap.P);
    frontPID.setI(RobotMap.I);
    frontPID.setD(RobotMap.D);
    frontPID.setIZone(0);
    frontPID.setFF(0);

    backPID.setP(RobotMap.P);
    backPID.setI(RobotMap.I);
    backPID.setD(RobotMap.D);
    backPID.setIZone(0);
    backPID.setFF(0);
  }

  public void driveFront(double val) {
    front.set(val);
  }

  public void driveBack(double val) {
    back.set(val);
  }

  public void driveBoth(double val) {
    back.set(val);
    front.set(val);
  }

  public void setFrontPID(double pos) {
    frontPID.setReference(pos, ControlType.kPosition);
  }

  public void setBackPID(double pos) {
    backPID.setReference(pos, ControlType.kPosition);
  }

  public void setBothPID(double pos) {
    frontPID.setReference(pos, ControlType.kPosition);
    backPID.setReference(pos, ControlType.kPosition);
  }

  public double getFrontPosition() {
    return frontEncoder.getPosition();
  }

  public double getBackPosition() {
    return backEncoder.getPosition();
  }

  public double getFrontVelocity() {
    return frontEncoder.getVelocity();
  }

  public double getBackVelocity() {
    return backEncoder.getVelocity();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ClimberDrive());
  }
}
