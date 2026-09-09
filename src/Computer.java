public class Computer {

    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;

    public Computer(String cpu, int ram, int storage,  String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;

    }
    @Override public String toString() {
        return "ComputerBuilder [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage +
                ", gpu=" + gpu + "]";
    }
}