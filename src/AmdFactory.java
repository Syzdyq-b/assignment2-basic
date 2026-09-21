public class AmdFactory implements ComponentFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Gpu createGpu() {
        return new AmdGpu();
    }
}
