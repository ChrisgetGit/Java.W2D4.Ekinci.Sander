

package Christian;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        ArrayList<Human> personList = new ArrayList<Human>();

        Male charlie= new Male("Charlie");
        personList.add(charlie);
        Male christian = new Male("Christian");
        personList.add(christian);

        Female carla = new Female("Carla");
        personList.add(carla);
        Female patricia = new Female("Patricia");
        personList.add(patricia);
        Female christina = new Female("Christina");
        personList.add(christina);



        for (Human human : personList) {
            human.getName();
            human.getChromosomes();
        }
    }
}
