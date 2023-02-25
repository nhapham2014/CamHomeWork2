package camjava_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai1 {
    public int DemSo(int[] number)
    {
        int dem=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length ; j++) {
                if(number[i]==number[j])
              {

                    dem++;
                    break;
                }


            }

        }
        return dem;

    }
    @Test
    public void Test_DemSo()
    {
        int[] number={0,1,2,3,1,2};
        int expect = 5;
        int actual = this.DemSo(number);
        //Object assertEquals;
        assertEquals(expect,actual);
    }
}
