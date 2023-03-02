package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai1 {
    public boolean KiemTraMang(int number, int[] List) {
        //boolean kq=true;
        for (int i = 0; i < List.length; i++) {
            if (number == List[i]) {
                return true;
            }

        }
        return false;
    }

    public int DemSo(int[] number) {
        int[] kq = new int[number.length];
        int dem = 0;
        for (int i = 0; i < number.length; i++) {
            boolean com1 = KiemTraMang(number[i], number);
            boolean com2 = !KiemTraMang(number[i], kq);
            if (com1 && com2) {
                kq[dem] = number[i];
                dem++;
            }

        }
        return dem - 1;
    }


    @Test
    public void Test_DemSo() {
        int[] number = {0, 1, 2, 3, 1, 2, 1, 1, 2};
        int expect = 2;
        int actual = this.DemSo(number);
        //Object assertEquals;
        assertEquals(expect, actual);
    }
}

