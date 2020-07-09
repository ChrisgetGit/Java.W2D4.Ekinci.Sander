package Christian;

public class Female extends Human{

    String name;

    Female(String name){
        this.name = name;
    }

    public void getChromosomes(){
        System.out.println("XX --> female");
    }

    public void getName(){
        System.out.print(name + " is: ");
    }
}
