public class Computer {

    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;
    private final String OperatingSystem;

    public Computer(String cpu, int ram, int storage,  String gpu, String OperatingSystem) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.OperatingSystem = OperatingSystem;

    }
    @Override public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage +
                ", gpu=" + gpu + ", OperatingSystem=" + OperatingSystem + "]";
    }
}