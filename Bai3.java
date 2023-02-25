package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Bai3 {
    public int TimSo(int number) {

        if (number == 0 || number == 1) {
            return number;
        } else {
            return TimSo(number-1)+TimSo(number-2);
        }

    }

    public int[] LietKeDaySo(int number) {
        int[] kq = new int[number];
        int index = 0;
        //int n = 0;
        while (index < number) {
            kq[index] = TimSo(number);
            index++;

        }

        return kq;
    }


    @Test
    public void Test_LietKeDaySo() {
        int number = 4;
        int[] expect = {1, 1, 2, 3};
        int[] actual = this.LietKeDaySo(number);
        assertArrayEquals(expect, actual);
    }
}
