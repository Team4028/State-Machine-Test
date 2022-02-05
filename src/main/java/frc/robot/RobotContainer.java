// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.forwardCom;
import frc.robot.commands.reverseCom;
import frc.robot.commands.stateCom;
import frc.robot.commands.stopCom;
import frc.robot.subsystems.Statemachine;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private XboxController _controller = new XboxController(0);
  public JoystickButton _A = new JoystickButton(_controller, XboxController.Button.valueOf("kA").value);
  public JoystickButton _B = new JoystickButton(_controller, XboxController.Button.valueOf("kB").value);
  public JoystickButton _X = new JoystickButton(_controller, XboxController.Button.valueOf("kX").value);
  public JoystickButton _Y = new JoystickButton(_controller, XboxController.Button.valueOf("kY").value);
  private stateCom _comS = new stateCom();
  // The robot's subsystems and commands are defined here...
  //private final dateTime m_exampleSubsystem = new dateTime();

  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    _A.whenPressed(new forwardCom());
    _B.whenPressed(new reverseCom());
    _X.whenPressed(new stopCom());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public void getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
  }
}