

package Christian;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        ArrayList<Human> personList = new ArrayList<Human>();

        Male charlie= new Male();
        personList.add(charlie);
        Male christian = new Male();
        personList.add(christian);

        Female carla = new Female();
        personList.add(carla);
        Female patricia = new Female();
        personList.add(patricia);
        Female christina = new Female();
        personList.add(christina);



        for (Human human : personList) {

            System.out.println(human+" ");
            human.getChromosomes();
        }

    }


}
