package advanced_java;

public class BytecodeDemo {

    public void greet() {

        System.out.println(
                "Welcome to Java Bytecode Demo"
        );
    }

    public static void main(String[] args) {

        BytecodeDemo obj =
                new BytecodeDemo();

        obj.greet();

        System.out.println(
                "\nCompile Command:"
        );

        System.out.println(
                "javac BytecodeDemo.java"
        );

        System.out.println(
                "\nBytecode Inspection Command:"
        );

        System.out.println(
                "javap -c BytecodeDemo"
        );
    }
}