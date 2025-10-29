package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class ParallelCommand extends ParallelCommandGroup
{
    /*
     * Run both the shooter and algae remover at the same time,
     * then stop them both. Runtime of your choosing.
     */
    public ParallelCommand ()
    {
        addCommands(
            ShooterForwards(1.5);
            AlgaeForwards(1.5);
            ShooterBackwards(1.5);
            AlgaeBackwards(1.5);
            ShooterStop();
            AlgaeStop();
        );

        addRequirements();
    }
}
