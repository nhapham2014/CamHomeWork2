package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Bai3 {

    public int[] LietKeDaySo(int number) {
        int[] kq = new int[number];
        if(number==1){
            kq[0]=0;
        }
        else if (number==2) {
            kq[0]=0;
            kq[1]=1;

        } else if (number>=3) {
            kq[0]=0;
            kq[1]=1;
            for (int i = 2; i < number; i++) {
                kq[i]=kq[i-1]+kq[i-2];

            }

        }

        return kq;
    }


    @Test
    public void Test_LietKeDaySo() {
        int number = 4;
        int[] expect = {0,1,1,2};
        int[] actual = this.LietKeDaySo(number);
        assertArrayEquals(expect, actual);
    }
}
