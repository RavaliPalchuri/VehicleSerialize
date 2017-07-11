/**
 * Created by palchurl on 7/10/2017.
 */
import java.io.*;

public class Deserialiseveh {
    public static void main(String[] args)
    {
        try
        {

            System.out.println("De serializing object...");
            //DeSerialization starts here
            FileInputStream fis = new FileInputStream("..\\veh.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            VehicleArray toa = (VehicleArray)ois.readObject();

            System.out.println("before printing Object");

            for(Vehicle si:toa.arr)//foreach
            {
                System.out.println(si);
            }

            //RMI(Remote Method Invocation) is based on Serialization/Deserialization
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}

