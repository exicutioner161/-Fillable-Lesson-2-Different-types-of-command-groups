package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class SequentialCommand extends SequentialCommandGroup
{
    public SequentialCommand() {
        addCommands(
            new ShooterForwards(1.5),
            new ShooterBackwards(1.5),
            new ShooterStop(),
            new AlgaeForwards(1.5),
            new AlgaeBackwards(1.5),
            new AlgaeStop()
        );

        addRequirements();
    }
}
