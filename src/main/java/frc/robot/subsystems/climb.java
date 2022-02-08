// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.Date;
import java.util.Scanner;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;

class State {
  static State current;
  static State extend1A;
  static State driveForward1;
  static State retract1A;
  static State pivot1B;
  static State extend2A;
  static State pivot2B;
  static State extend3A;
  static State pivot3B;
  static State retract2A;
  static State disengage1B;
  static State pivot4B;
  static State retract3A;
  static State pivot5B;
  static State extend4A;
  static climber _i;

  static long startTime;
  static long elapsedTime; 
  
   
    
    
    
  
  

  public State(){
    _i = climber.get_instance();
   }
 
   void getclassName(){
     System.out.println(this.getClass().getSimpleName());
   }
  void enter() {}
  void update() {}
}

class extend1A extends State{
  void enter() {
    startTime = new Date().getTime();
    _i.set(.2);
    getclassName();
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = driveForward1; 
    return;
   }
  }
  
    }

}

class driveForward1 extends State{
  void enter() {
    startTime = new Date().getTime();
    getclassName();
    
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = retract1A; 
    return;
   }
  }
  
    }

}

class retract1A extends State{
  void enter() {
    startTime = new Date().getTime();
    _i.set(.2);
    getclassName();
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = pivot1B; 
    return;
   }
  }
  
    }

}

class pivot1B extends State{
  void enter() {
    startTime = new Date().getTime();
    _i.set(-.2);
    getclassName();
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = extend2A; 
    return;
   }
  }
  
    }

}

class extend2A extends State{
  void enter() {
    
    startTime = new Date().getTime();
    getclassName();

    _i.set(.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){

    current = pivot2B; 
    return;
   }
  }
  
    }

}

class pivot2B extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = extend3A; 
    return;
   }
  }
  
    }

}

class extend3A extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){

    current = pivot3B; 
    return;
   }
  }
  
    }

}

class pivot3B extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = retract2A; 
    return;
   }
  }
  
    }

}

class retract2A extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = disengage1B; 
    return;
   }
  }
  
    }

}

class disengage1B extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = pivot4B; 
    return;
   }
  }
  
    }

}

class pivot4B extends State{
  void enter() {
    startTime = new Date().getTime();
    _i.set(.2);
    getclassName();
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = retract3A; 
    return;
   }
  }
  
    }

}

class retract3A extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = pivot5B; 
    return;
   }
  }
  
    }

}

class pivot5B extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
    current = extend4A; 
    return;
   }
  }
  
    }

}

class extend4A extends State{
  void enter() {
    startTime = new Date().getTime();
    
    getclassName();
    _i.set(-.2);
    
  }
  void update() {
   while(true){
    elapsedTime = new Date().getTime()-startTime;
    if(elapsedTime > 3000){
      _i.set(0); 
    return;
   }
  }
  
    }

}

public class climb {
  public static void main(){
 
   
   State.extend1A = new extend1A();
   State.driveForward1 = new driveForward1();
   State.retract1A = new retract1A();
   State.pivot1B = new pivot1B();
   State.extend2A = new extend2A();
   State.pivot2B = new pivot2B();
   State.extend3A = new extend3A();
   State.pivot3B = new pivot3B();
   State.retract2A = new retract2A();
   State.disengage1B = new disengage1B();
   State.pivot4B = new pivot4B();
   State.retract3A = new retract3A();
   State.pivot5B = new pivot5B();
   State.extend4A = new extend4A();
   State.current = State.extend1A;
 
   while(true){
     State.current.enter();
     State.current.update();
   }
 
}





 

 public static climb get_instance() {
  climb _instance = new climb();
  return _instance;
}
}

/*class forward extends State{
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
}*/



  


