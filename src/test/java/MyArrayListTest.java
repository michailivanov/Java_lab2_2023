import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import michail.MyArrayList;
public class MyArrayListTest {
    @Test
    public void testAddAndGet() {
        MyArrayList<String> customList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        customList.add("Element 1");
        customList.add("Element 2");
        customList.add("Element 3");

        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        for (int i = 0; i < customList.size(); i++) {
            assertEquals(arrayList.get(i), customList.get(i));
        }
    }

    @Test
    public void testRemove() {
        MyArrayList<String> customList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        customList.add("Element 1");
        customList.add("Element 2");
        customList.add("Element 3");

        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        customList.remove(1);
        arrayList.remove(1);

        for (int i = 0; i < customList.size(); i++) {
            assertEquals(arrayList.get(i), customList.get(i));
        }
    }

    @Test
    public void testContains() {
        MyArrayList<String> customList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        customList.add("Element 1");
        customList.add("Element 2");
        customList.add("Element 3");

        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        assertTrue(customList.contains("Element 2"));
        assertTrue(arrayList.contains("Element 2"));

        assertFalse(customList.contains("Non-existent Element"));
        assertFalse(arrayList.contains("Non-existent Element"));
    }

    @Test
    public void testIterable() {
        MyArrayList<String> customList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        customList.add("Element 1");
        customList.add("Element 2");
        customList.add("Element 3");

        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        List<String> customElements = new ArrayList<>();
        for (String element : customList) {
            customElements.add(element);
        }

        assertEquals(arrayList, customElements);
    }
}

