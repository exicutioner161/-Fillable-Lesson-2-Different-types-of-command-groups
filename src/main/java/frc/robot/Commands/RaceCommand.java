package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;

public class RaceCommand extends
                SequentialCommandGroup {
        /*
         * Run both the shooter and the remover set one of them to be shorter than the
         * other stop both after race group
         */
        public RaceCommand() {
                // completed by BT
                addCommands(new ParallelRaceGroup(
                                new ShooterForwards(
                                                1),
                                new AlgaeForwards(
                                                1.5),
                                new ShooterBackwards(
                                                1.5),
                                new AlgaeBackwards(
                                                1.5)),
                                new SequentialCommandGroup(
                                                new ShooterStop(),
                                                new AlgaeStop()));

                addRequirements(getRequirements());
        }
}
