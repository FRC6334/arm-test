package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;

public class CommandBase extends Command {
    public static Arm arm;

    public static void init() {
        arm = new Arm();
    }

    public CommandBase(String name) {
        super(name);
      }
    
      public boolean isFinished() {
        return false;
    }
}