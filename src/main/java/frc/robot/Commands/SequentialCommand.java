package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class SequentialCommand extends SequentialCommandGroup
{
    public SequentialCommand ()
    {
        addCommands(
            ShooterForwards(1.5);
            ShooterBackwards();
            ShooterStop();
            AlgaeForwards(1.5);
            AlgaeBackwards(1.5);
            AlgaeStop();
        );

        addRequirements();
    }
}
