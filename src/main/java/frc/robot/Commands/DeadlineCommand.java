package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class DeadlineCommand extends SequentialCommandGroup
{
    /*
     * Run both the shooter and the remover
     * set one of them to be shorter than the other
     * stop both after deadline group
     */
    public DeadlineCommand ()
    {
        addCommands(
            ShooterForwards(1);
            AlgaeForwards(1.5);
            ShooterBackwards(1.5);
            AlgaeBackwards(1.5);
            ShooterStop();
            AlgaeStop();
        );

        addRequirements();
    }
}