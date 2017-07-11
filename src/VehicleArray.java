/**
 * Created by palchurl on 7/10/2017.
 */
import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

import java.io.Serializable;
import java.util.List;

class Vehicle implements Serializable
{
    //transient data members will not take part in Serialization
    String reg;
    int modelid;
    String insurance_name;
    String area;
    String city;
    Vehicle(String n, int r,String area,String city)
    {
        this.reg = n;
        this.modelid = r;
        this.area=area;
        this.city=city;
    }
Vehicle(){

    }

    void printStudentInfo()
    {
        System.out.println("StudentInfo details Test:"+reg+" "+modelid+" "+area+" "+city);
    }

    public String toString()
    {
        return "name="+reg+", id="+modelid+", city="+city+",area="+area;
    }
}


class VehicleArray implements Serializable{
    Vehicle arr[];

    VehicleArray(Vehicle arr[])
    {
        this.arr = arr;
    }
}
