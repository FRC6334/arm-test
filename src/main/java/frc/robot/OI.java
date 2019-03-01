/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.MoveArmToRocket2;
import frc.robot.commands.MoveArmToRocket3;
import frc.robot.commands.Team6334PID;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private static Joystick mainStick = new Joystick(RobotMap.joystickPort);

  public static Joystick getStick() {
    return mainStick;
  }

  public static void init() {
    Button rocketLevel2 = new JoystickButton(mainStick, 4);
    Button rocketLevel3 = new JoystickButton(mainStick, 5);
    Button PIDtest      = new JoystickButton(mainStick, 2);
    

    rocketLevel2.whileHeld(new MoveArmToRocket2());
    rocketLevel3.whileHeld(new MoveArmToRocket3());
    PIDtest.whileHeld(new Team6334PID());
  }
  
}
