import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class codeTest {


    @Test
    void sort() {
        Code arraySort = new Code();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{5,3,2,4,1}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{1,2,3,4,5}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{3,2,21,12,43}));


    }

}