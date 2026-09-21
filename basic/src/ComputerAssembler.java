public class ComputerAssembler {
    private static final int RAM_GB = 16;
    private static final int STORAGE_GB = 512;
    private static final String OPERATING_SYSTEM = "Windows 11";

    private final ComponentFactory factory;

    public ComputerAssembler(ComponentFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.factory = factory;
    }

    public Computer assemble() {
        Cpu cpu = factory.createCpu();
        Gpu gpu = factory.createGpu();

        return new ComputerBuilder()
                .setCpu(cpu.getName())
                .setGpu(gpu.getName())
                .setRam(RAM_GB)
                .setStorage(STORAGE_GB)
                .setOperatingSystem(OPERATING_SYSTEM)
                .build();
    }
}
