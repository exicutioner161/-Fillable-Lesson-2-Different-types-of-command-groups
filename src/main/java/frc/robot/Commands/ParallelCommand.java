package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class ParallelCommand extends
                SequentialCommandGroup {
        /*
         * Run both the shooter and algae remover at the same time, then stop them both.
         * Runtime of your choosing.
         */
        public ParallelCommand() {
                // completed by BT
                addCommands(new ParallelCommandGroup(
                                new ShooterForwards(
                                                1.5),
                                new AlgaeForwards(
                                                1.5)));

                addRequirements(getRequirements());
        }
}
