/*
5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
*/
class Vehicle{
 public int gear = 1;
 public int speed = 0;
 public char wheel;
 public void steer(char side){
  if(side == 's' || side == 'l' || side == 'r') {
   this.wheel = side;
  }
 }
 public void changegear(int gear){
  if(gear > 0 && gear < 7){
   this.gear = gear;
  }
 }
 public void changespeed (int speed){
  if (speed >= 0 && speed < 300){
   this.speed = speed;
  }
 }

}
class Car extends Vehicle {

}

class Volvo extends Car {

}

public class day3_fifth {

}
