package org.example;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        Composite composite1 = new Composite("Composite 1");
        composite1.add(leaf1);
        composite1.add(leaf2);

        Leaf leaf3 = new Leaf("Leaf 3");
        Composite composite2 = new Composite("Composite 2");
        composite2.add(leaf3);

        Composite mainComposite = new Composite("Main Composite");
        mainComposite.add(composite1);
        mainComposite.add(composite2);

        mainComposite.operation();
    }
}