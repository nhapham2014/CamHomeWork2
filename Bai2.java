package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Bai2 {
    public int[] DaySo(int[] Array1, int[] Array2)
    {
        int[] kq=  Array1;
        int tong1=0;
        int tong2=0;
        for (int i = 0; i < Array1.length; i++) {
            tong1=tong1+Array1[i];

        }
        for (int j = 0; j < Array2.length; j++) {
            tong2=tong2+Array2[j];

        }
        if (tong1>tong2){
            kq= Array1;
        }
        else{
            kq=Array2;
        }
        return kq;
    }
    @Test
    public void Test_DaySo()
    {
        int[] Array1 = {1,2,3};
        int[] Array2 = {1,0,1};
        int[] expect = {1,2,3};
        int[] actual=this.DaySo(Array1,Array2);
        assertArrayEquals(expect,actual);
    }
}
