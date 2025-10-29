package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class ShooterForwards extends SequentialCommandGroup
{
    /** Will run for 1s when no time given
     * @param time the time in seconds the command runs
    */
    public ShooterForwards (double time)
    {
        addCommands(
            Constants.SHOOTER_SUBSYSTEM.runMotorForwardsCommand().withTimeout(time)
            );
        
        addRequirements(Constants.SHOOTER_SUBSYSTEM);
    }

    public ShooterForwards ()
    {
        this(1);
    }
}
