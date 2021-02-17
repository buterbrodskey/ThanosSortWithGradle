import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortTest {
    @Test
    public void oddCountSortTest() {
        int[] i = {2, -94, 12, 22, 66, 10, 99, 0};
        int[] expectedArray = {-94, 0, 2, 10, 12, 22, 66, 99};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void evenCountSortTest() {
        int[] i = {2, 94, 12, 22, 66, 10, 99};
        int[] expectedArray = {2, 10, 12, 22, 66, 94, 99};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void emptyArraySortTest() {
        int[] i = {};
        int[] expectedArray = {};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void singleElementSortTest() {
        int[] i = {2};
        int[] expectedArray = {2};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void pairElementSortTest() {
        int[] i = {2, 1};
        int[] expectedArray = {1, 2};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void sameElementSortTest() {
        int[] i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] expectedArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Main.ThanosSort(i, 0, i.length);
        Assertions.assertArrayEquals(expectedArray, i);
    }


//    @Test
//    public void
}
