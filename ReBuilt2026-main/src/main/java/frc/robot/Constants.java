package frc.robot;

public final class Constants {

    // PID constants
    public static final double KP = 3.0;
    public static final double KI = 0.0;
    public static final double KD = 0.0;
    public static final double KIz = 0.0;
    public static final double KFF = 0.3;
    public static final double MaxOutput = 1.0;
    public static final double kMinOutput = -1.0;
    public static final double MaxRPM = 5700;
    // TODO: add current limiting constants later if needed

    // Controller + input settings
    public static final class OIConstants {
        public static final int kDriverOneControllerPort = 0;
        public static final int kDriverTwoControllerPort = 1;
        public static final double kDriveDeadband = 0.1;
        public static final double kTriggerButtonThreshold = 0.2;
    }
}
