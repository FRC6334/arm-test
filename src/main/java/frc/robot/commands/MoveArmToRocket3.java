/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.RobotMap;

public class MoveArmToRocket3 extends CommandBase {
  public MoveArmToRocket3() {
    super("MoveArmToRocket3");
    // Use requires() here to declare subsystem dependencies
    requires(arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Movement to rocket level 3 init");
    arm.setReference(RobotMap.rocketLevel3);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Moving to 3...");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("Movement to rocket level 3 done.");
    arm.setMotorPower(0); // Kill the PID loop
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Level 3 PID interrupt");
  }
}
