/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeArrayVehicle
{
    
 public static void main(String[] args)
 {

 try
 {
//Serialization starts here
  Vehicle si1 = new Vehicle("car1", 1,"hitech","hyd");

  Vehicle si2 = new Vehicle("car2",2,"hitech1","hyd1");

  Vehicle si3 = new Vehicle("car3", 3,"hitech2","hyd2");

  Vehicle sarr[] = {si1, si2, si3};

  VehicleArray sia = new VehicleArray(sarr);

  FileOutputStream fos = new FileOutputStream("..\\veh.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fos);

  System.out.println("Serialing the object...");
  oos.writeObject(sia);
  oos.close();
  fos.close();  
  }
  catch (Exception e)
  { e. printStackTrace(); }
 }
}