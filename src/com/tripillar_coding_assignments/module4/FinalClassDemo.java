package com.tripillar_coding_assignments.module4;

// Final class
class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Attempt to inherit the final class
class Test extends FinalClass {   // This will cause a compile-time error
    void show() {
        System.out.println("Trying to inherit final class.");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}