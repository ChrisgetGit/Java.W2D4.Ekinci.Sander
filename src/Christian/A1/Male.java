package Christian.A1;

public class Male extends Human {
    String name;
    Male (String name) {
        this.name = name;
    }


    public void getName(){
        System.out.print(name + " is: ");
    }


    public void getChromosomes() {
        System.out.println("XY --> male");

    }
}
