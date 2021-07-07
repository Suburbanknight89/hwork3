package guru.qa;

public class PC {

    static String firstCreationDate = "1965";

    String producer;
    boolean isAli = false;
    boolean withVC = true;
    double CPUfrequency;
    int RAM;

    public PC(String producer, boolean isAli, boolean withVC, double CPUfrequency, int RAM) {
        this.producer = producer;
        this.CPUfrequency = CPUfrequency;
        this.isAli = isAli;
        this.withVC = withVC;

    }

    public PC() {
    }

    String callproducer() {
        return     producer;
    }

    public int getRam() {
        return     RAM;
    }

    void OLCPU(double CPUfrequency) {
        this.CPUfrequency = CPUfrequency;
    }

    void OLRAM(int RAM) {
        this.RAM = RAM;
    }
    static void firstCreationDate() {
        System.out.println(firstCreationDate);
    }

}