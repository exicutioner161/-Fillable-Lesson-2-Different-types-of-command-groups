package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class AlgaeBackwards extends SequentialCommandGroup
{
    /** Will run for 1s if no time given
     * @param time the time in seconds the command runs
    */
    public AlgaeBackwards (double time)
    {
        addCommands(
            Constants.ALGAE_REMOVER_SUBSYSTEM.runRemoverBackwardsCommand().withTimeout(time)
            );
        
        addRequirements(Constants.ALGAE_REMOVER_SUBSYSTEM);
    }

    public AlgaeBackwards ()
    {
        this(1);
    }
}