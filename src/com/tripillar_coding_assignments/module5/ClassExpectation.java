package com.tripillar_coding_assignments.module5;

public class ClassExpectation extends Exception {
    ClassExpectation(String message) {
        super(message);
    }
}
class Main{
    static void checkAge(int age) throws ClassExpectation {
        if (age < 18){
            throw new ClassExpectation("Age must be 18");
        }
        System.out.println("valid age");
    }
    static void main(String[] args) {
        try {
            checkAge(17);
        }catch (ClassExpectation e){
            System.out.println(e.getMessage());
        }
    }
}
