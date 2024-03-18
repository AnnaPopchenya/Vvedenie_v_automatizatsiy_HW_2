package org.example;

public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        if (name == null) {
            throw new NullPointerException("Name is null");
        } else {
            System.out.println("Leaf " + name + " operation");
        }
    }
}