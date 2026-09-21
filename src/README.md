# Computer Builder + Abstract Factory

Assignment #1 (Builder) continued in Assignment #2 (Abstract Factory). Domain: computers. Language: Java.

## Run
Open the project in IntelliJ IDEA and run `src/Main.java`.

## Classes
| Pattern | Role | Class |
|---|---|---|
| Builder (Assignment #1) | Product / Builder / Director | `Computer`, `ComputerBuilder`, `ComputerDirector` |
| Abstract Factory | Abstract Products | `Cpu`, `Gpu` |
| | Concrete Products, Intel family | `IntelCpu`, `IntelGpu` |
| | Concrete Products, AMD family | `AmdCpu`, `AmdGpu` |
| | Abstract Factory | `ComponentFactory` (`createCpu()`, `createGpu()`) |
| | Concrete Factories | `IntelFactory`, `AmdFactory` |
| | Client | `ComputerAssembler` |

## How it works
`ComputerAssembler` receives a `ComponentFactory`, asks it for a `Cpu` and a `Gpu` of one family,
and passes them to `ComputerBuilder` from Assignment #1. The client never creates concrete
parts itself, so Intel and AMD parts can never be mixed by mistake.

## Clean Code principles

### 1. Meaningful names
```java
// Before
class F1 implements I { A a() { return new B(); } }
// After
class IntelFactory implements ComponentFactory { public Cpu createCpu() { return new IntelCpu(); } }
```

### 2. Small methods, each does one thing
```java
Cpu createCpu();                    // only creates a CPU
Gpu createGpu();                    // only creates a GPU
public Computer assemble() { ... }  // only assembles a computer from the parts
```

### 3. No magic numbers or strings
```java
// Before
.setRam(16).setStorage(512).setOperatingSystem("Windows 11")
// After
private static final int RAM_GB = 16;
private static final int STORAGE_GB = 512;
private static final String OPERATING_SYSTEM = "Windows 11";
```

### 4. Validated construction
```java
// ComputerBuilder.build() calls validate() and throws IllegalArgumentException on bad data
public ComputerAssembler(ComponentFactory factory) {
    if (factory == null) {
        throw new IllegalArgumentException("factory must not be null");
    }
    this.factory = factory;
}
```
### 5. Program to interfaces
```java
// Before
Cpu cpu = new IntelCpu();            // client depends on a concrete class
// After
Cpu cpu = factory.createCpu();       // client depends only on the interface
```

### 6. Small focused classes, consistent formatting
One class = one job (`IntelCpu` only describes an Intel CPU). Same 4-space indentation and naming style everywhere.
