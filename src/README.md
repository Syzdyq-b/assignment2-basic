# Computer Builder

## Description

This project demonstrates the Builder Design Pattern in Java.

The project is about building a Computer step by step using the Builder Pattern.
The Computer can have different CPU, RAM, storage, and GPU configurations.

## Design Pattern

The Builder Pattern is a creational design pattern.
It is used to construct a complex object step by step.

### Components

- Product: Computer
- Builder: ComputerBuilder
- Director: ComputerDirector
- Client: Main

## How It Works

The ComputerBuilder allows us to configure a computer step by step:

```java
Computer computer = new ComputerBuilder()
        .setCpu("AMD Ryzen 7")
        .setRam(16)
        .setStorage(512)
        .setGpu("RTX 4060")
        .build();