package calNextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    @DisplayName("Case 1")
    void case1() {
        int[] inputDate = new int[]{1, 1, 2018};
        int[] expected = new int[]{2, 1, 2018};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
    @Test
    @DisplayName("Case 2")
    void case2() {
        int[] inputDate = new int[]{31, 1, 2018};
        int[] expected = new int[]{1, 2, 2018};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
    @Test
    @DisplayName("Case 3")
    void case3() {
        int[] inputDate = new int[]{30, 4, 2018};
        int[] expected = new int[]{1, 5, 2018};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
    @Test
    @DisplayName("Case 4")
    void case4() {
        int[] inputDate = new int[]{28, 2, 2018};
        int[] expected = new int[]{1, 3, 2018};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
    @Test
    @DisplayName("Case 5")
    void case5() {
        int[] inputDate = new int[]{29, 2, 2020};
        int[] expected = new int[]{1, 3, 2020};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
    @Test
    @DisplayName("Case 6")
    void case6() {
        int[] inputDate = new int[]{31, 12, 2018};
        int[] expected = new int[]{1, 1, 2019};

        int[] result = NextDay.calNext(inputDate[0], inputDate[1], inputDate[2]);
        assertArrayEquals(result, expected);
    }
//        int[][] input = {
//                {1, 1, 2018},
//                {31,1,2018},
//                {30,4,2018},
//                {28,2,2018},
//                {29,1,2020},
//                {31,12,2018}
//
//        };
//        int[][] expected = {
//                {2, 1, 2018},
//                {1,2,2018},
//                {1,5,2018},
//                {1,3,2018},
//                {1,3,2020},
//                {1,1,2019}
//        };
//
//        int[][] result = new int[input.length][3];
//
//        for (int i = 0; i < input.length; i++){
//            for (int j = 0; j < 3; j++){
//                result[i][j] = NextDay.calNext(input[i][j],input[i][j],input[i][j]);
//            }
//        }
//        assertArrayEquals(expected, result);

}