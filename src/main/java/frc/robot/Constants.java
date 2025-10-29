package frc.robot;

import frc.robot.Subsystems.*;

public final class Constants {
    
    //motor IDs
    public static final int ShooterID = 1;
    public static final int AlgaeRemoverID = 2;

    //operation IDs
    public static final int kControllerPort = 13;

    //subsystems
    public static final AlgaeRemoverSubsystem ALGAE_REMOVER_SUBSYSTEM = new AlgaeRemoverSubsystem();
    public static final ShooterSubsystem SHOOTER_SUBSYSTEM = new ShooterSubsystem();
}
