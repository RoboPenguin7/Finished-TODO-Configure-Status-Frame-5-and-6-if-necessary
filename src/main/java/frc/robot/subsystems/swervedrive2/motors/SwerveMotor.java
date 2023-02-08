package frc.robot.subsystems.swervedrive2.motors;

import frc.robot.subsystems.swervedrive2.parser.PIDFConfig;

public abstract class SwerveMotor
{

  /**
   * Configure the factory defaults.
   */
  public abstract void factoryDefaults();

  /**
   * Clear the sticky faults on the motor controller.
   */
  public abstract void clearStickyFaults();

  /**
   * Configure the integrated encoder for the swerve module. Sets the conversion factors for position and velocity.
   *
   * @param isDriveMotor Is the SwerveModule a drive motor.
   */
  public abstract void configureIntegratedEncoder(boolean isDriveMotor);

  /**
   * Configure the PIDF values for the closed loop controller. 0 is disabled or off.
   *
   * @param isDriveMotor Drive motor.
   * @param config       Configuration class holding the PIDF values.
   */
  public abstract void configurePIDF(boolean isDriveMotor, PIDFConfig config);

  /**
   * Configure the PID wrapping for the position closed loop controller.
   *
   * @param minInput Minimum PID input.
   * @param maxInput Maximum PID input.
   */
  public abstract void configurePIDWrapping(double minInput, double maxInput);

  /**
   * Set the idle mode.
   *
   * @param isBrakeMode Set the brake mode.
   */
  public abstract void setMotorBrake(boolean isBrakeMode);

  /**
   * Set the motor to be inverted.
   *
   * @param inverted State of inversion.
   */
  public abstract void setInverted(boolean inverted);

  /**
   * Save the configurations from flash to EEPROM.
   */
  public abstract void burnFlash();

  /**
   * Set the percentage output.
   *
   * @param percentOutput percent out for the motor controller.
   */
  public abstract void set(double percentOutput);

  /**
   * Set the closed loop PID controller reference point.
   *
   * @param isDriveMotor If the drive motor is set then the velocity else angle.
   * @param setpoint     Setpoint in MPS or Angle in degrees.
   * @param feedforward  Feedforward in volt-meter-per-second or kV.
   */
  public abstract void setReference(boolean isDriveMotor, double setpoint, double feedforward);

  /**
   * Get the velocity of the integrated encoder.
   *
   * @return velocity
   */
  public abstract double getVelocity();

  /**
   * Get the position of the integrated encoder.
   *
   * @return Position
   */
  public abstract double getPosition();

  /**
   * Set the integrated encoder position.
   *
   * @param position Integrated encoder position. Should be angle in degrees or meters per second.
   */
  public abstract void setPosition(double position);
}
