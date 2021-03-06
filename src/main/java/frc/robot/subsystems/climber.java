// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class climber extends SubsystemBase {
  /** Creates a new motor. */
  CANSparkMax _m;
  DigitalInput _button;
  private static climber _instance = new climber();
  public climber() {
    _m = new CANSparkMax(1, MotorType.kBrushless);
    _button = new DigitalInput(0);
  }
  public void set(double vbus){
    _m.set(vbus);
  }
  public boolean isClosed(){
    return _button.get();
  }
   public static climber get_instance() {
      return _instance;
   }
    



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
