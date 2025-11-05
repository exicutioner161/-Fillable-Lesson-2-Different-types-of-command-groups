package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

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
            new ShooterForwards(1),
            new AlgaeForwards(1.5),
            new ShooterBackwards(1.5),
            new AlgaeBackwards(1.5),
            new ShooterStop(),
            new AlgaeStop()
        );

        addRequirements();
    }
}