public class ComputerBuilder {
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String operatingSystem;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    public ComputerBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
    public Computer build() {
        validate();

        return new Computer(cpu,ram,storage,gpu,operatingSystem);

    }
    private void validate() {
        if (cpu == null || cpu.isBlank()) {
            throw new IllegalArgumentException("cpu is required");
        }
        if (ram <= 0 || ram > 65535) {
            throw new IllegalArgumentException("RAM must be positive");
        }
        if (storage <= 0 || storage > 65535) {
            throw new IllegalArgumentException("storage is out of range");
        }
    }
}
