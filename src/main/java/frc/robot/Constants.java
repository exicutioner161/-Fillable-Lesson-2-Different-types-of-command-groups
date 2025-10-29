package frc.robot;

import frc.robot.Subsystems.*;

public final class Constants {
    
    //motor IDs
    public static final int ShooterID = 11;
    public static final int AlgaeRemoverID = 13;

    //operation IDs
    public static final int kControllerPort = 0;

    //subsystems
    public static final AlgaeRemoverSubsystem ALGAE_REMOVER_SUBSYSTEM = new AlgaeRemoverSubsystem();
    public static final ShooterSubsystem SHOOTER_SUBSYSTEM = new ShooterSubsystem();
}
