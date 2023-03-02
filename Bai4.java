package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Bai4 {
    public int[] TongMang(int[] Array1, int[] Array2) {
        int[] kq = Array1;

        for (int i = 0; i < Array1.length && Array1.length == Array2.length; i++) {
            kq[i] = Array1[i] + Array2[i];
        }

        return kq;
    }

    @Test
    public void Test_TongMang() {
        int[] Array1 = {1, 2, 3, 400};
        int[] Array2 = {5, 9, 10, 12};
        int[] expect = {6, 11, 13, 412};
        int[] actual = this.TongMang(Array1, Array2);
        assertArrayEquals(expect, actual);
    }
}
