package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class SequentialCommand extends SequentialCommandGroup
{
    public SequentialCommand ()
    {
        addCommands(
            new ShooterForwards(1.5);
            new ShooterBackwards();
            new ShooterStop();
            new AlgaeForwards(1.5);
            new AlgaeBackwards(1.5);
            new AlgaeStop();
        );

        addRequirements();
    }
}
