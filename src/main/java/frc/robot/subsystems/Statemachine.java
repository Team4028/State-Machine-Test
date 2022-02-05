// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.Date;
import java.util.Scanner;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;

class State {
  static State forward;
  static State reverse;
  static State stop;
  static State current;
  static intake _i;

  static void delay(int delay){
    long startTime;
    long elapsedTime;
  
  
    startTime = new Date().getTime();
    do{
    elapsedTime = new Date().getTime()-startTime;
    } while(elapsedTime<delay);
    return;
  
  }

  public State(){
    _i = intake.get_instance();
   }
 

  void enter() {}
  void update() {}
}

class forward extends State{
  void enter() {
    _i.set(.2);
    
  }
  void update() {
   while(true){
    if(_i.isClosed()){
    current = reverse; 
    return;
   }
  }
  
    }

}
class reverse extends State{
  void enter() {
   _i.set(-.2);
    }
  
  void update() {
    while(true){
     if(!_i.isClosed()){
     current = stop; 
     return;
    }
   }
   
     }
    }

class stop extends State{
  void enter() {
    _i.set(0);
  }
  void update() {
    if(!_i.isClosed()){
      current = forward; 
      return;
    }
  
  }
}


public class Statemachine {
  public static void main(){
 
   
   State.forward = new forward();
   State.reverse = new reverse();
   State.stop = new stop();
   State.current = State.forward;
 
   while(true){
     State.current.enter();
     State.current.update();
   }
 
}





 

 public static Statemachine get_instance() {
  Statemachine _instance = new Statemachine();
  return _instance;
}
}
  


