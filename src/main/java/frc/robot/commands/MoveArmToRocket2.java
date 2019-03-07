/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.RobotMap;

public class MoveArmToRocket2 extends CommandBase {
  public MoveArmToRocket2() {
    super("MoveArmToRocket2");
    //requires(arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Movement to rocket position 2 init");
    //arm.setReference(RobotMap.rocketLevel2); // This is not accurate, just a stab at the point. Set this to whatever you need. 
    // Get the value by opening shuffleboard, enabling the robot, and moving the arm to the point. Record value and set here
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Moving to 2...");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("Move to rocket level 2 is done.");
    //arm.setMotorPower(0); // Kill PID loop
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Level 2 PID interrupt");
  }
}
