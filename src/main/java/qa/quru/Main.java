package guru.qa;

public class Main {

    public static void main(String[] args) {
        PC x220 = new PC ("Intel", true, true, 2.400, 16);
        PC macbook = new PC();

        macbook.OLRAM(32);
        x220.OLCPU(3.600);

        PC.firstCreationDate();

        System.out.println(x220.callproducer());
        System.out.println("now your overlcoked ram for" + " " + "macbook" + " is " + macbook.RAM);
    }
}