package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;

public class ParallelCommand extends ParallelCommandGroup
{
    /*
     * Run both the shooter and algae remover at the same time,
     * then stop them both. Runtime of your choosing.
     */
    public ParallelCommand ()
    {
        addCommands(
            new ShooterForwards(1.5),
            new AlgaeForwards(1.5),
            new ShooterBackwards(1.5),
            new AlgaeBackwards(1.5),
            new ShooterStop(),
            new AlgaeStop()
        );

        addRequirements();
    }
}
