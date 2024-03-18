package org.example;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component {
    private String name;
    private List<Component> children;

    public Composite(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    void operation() {
        System.out.println("Composite " + name + " operation");
        if (children.isEmpty()) {
            throw new IndexOutOfBoundsException("No children in Composite");
        }
        for (Component child : children) {
            child.operation();
        }
    }
}