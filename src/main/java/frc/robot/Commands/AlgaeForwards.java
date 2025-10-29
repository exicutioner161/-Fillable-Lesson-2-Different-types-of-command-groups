package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class AlgaeForwards extends SequentialCommandGroup
{
    /** Will run for 1s when no time given
     * @param time the time in seconds the command runs
    */
    public AlgaeForwards (double time)
    {
        addCommands(
            Constants.ALGAE_REMOVER_SUBSYSTEM.runRemoverForwardsCommand().withTimeout(time)
            );
        
        addRequirements(Constants.ALGAE_REMOVER_SUBSYSTEM);
    }

    public AlgaeForwards ()
    {
        this(1);
    }
}