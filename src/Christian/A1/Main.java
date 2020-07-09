package Christian.A1;
import ChristianA2.*;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        ArrayList<Human> personList = new ArrayList<>();

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

//A2
//Overload Method
        System.out.println("\n\nA2 Overload\n ");
        OverloadMethod test1 = new OverloadMethod();
        OverloadMethod test2 = new OverloadMethod();
        OverloadMethod test3 = new OverloadMethod();

        test1.sum(10, 15);
        test2.sum(10,15,20);
        test3.sum("Hello ", "you");
        //entering "wrong" datatype, converts it to next higher datatype in range (here int)
        test1.sum('a', 'b');


//Override Method
        System.out.println("\n\nA2 Override\n ");
        OverrideParent testtext = new OverrideParent();
        OverrideParent testtext2 = new OverrideChild();

        testtext.text();
        testtext2.text();

    }
}
