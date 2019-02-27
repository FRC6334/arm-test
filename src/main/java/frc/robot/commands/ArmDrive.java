/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.OI;

public class ArmDrive extends CommandBase {

  Joystick mainStick;

  public ArmDrive() {
    super("ArmDrive");
    requires(arm);
    mainStick = OI.getStick();
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("arm control init");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    arm.setMotorPower(mainStick.getY()); // Do not worry about a deadband checker, the Spark MAX does it for you.






    // Add custom PID math above
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("ArmDrive interrupt");
  }
}
