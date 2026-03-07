package com.tripillar_coding_assignments.module4;

public class Difference {
    static void main(String[] args) {
        String n = "Sujan";
        n = n + "Kulal";
        System.out.println("hashcode of string: " + n.hashCode());
        StringBuilder s = new StringBuilder("Sujan");
        System.out.println("before String builder: " + s.hashCode());
        s.append("Kulal");
        System.out.println("after String builder: " + s.hashCode());
        StringBuffer sb = new StringBuffer("Sujan");
        System.out.println("before String Buffer: " + s.hashCode());
        s.append("Kulal");
        System.out.println("after String Buffer: " + s.hashCode());
    }
}
