package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Climber;

public class CommandBase extends Command {
    //public static Arm arm;
    public static Climber climber;

    public static void init() {
        //arm = new Arm();
        climber = new Climber();
    }

    public CommandBase(String name) {
        super(name);
      }
    
      public boolean isFinished() {
        return false;
    }
}