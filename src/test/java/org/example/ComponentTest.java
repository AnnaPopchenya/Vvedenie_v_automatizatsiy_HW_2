package org.example;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ComponentTest {

    @Test
    void positiveLeafOperationTest() {
        Leaf leaf = new Leaf("Test Leaf");
        assertDoesNotThrow(() -> leaf.operation());
    }

    @Test
    void positiveCompositeOperationTest() {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite("Test Composite");
        composite.add(leaf1);
        composite.add(leaf2);

        assertDoesNotThrow(() -> composite.operation());
    }

    @Test
    void negativeLeafNameTest() {
        assertThrows(NullPointerException.class, () -> {
            Leaf leaf = new Leaf(null);
            leaf.operation(); // This should throw NullPointerException
        });
    }

    @Test
    void negativeCompositeOperationTest() {
        Composite composite = new Composite("Test Composite");
        assertThrows(IndexOutOfBoundsException.class, () -> composite.operation());
    }
}
