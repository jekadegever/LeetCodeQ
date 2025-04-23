
public class Main {


    public static void main(String[] args) {

        Time_Complexity.sortMod(new int[]{35,17,13,252,4,128,7,3,81},10);
        System.out.println(Time_Complexity.equalParts(new int[]{4,3,2,1,2,2}));
        System.out.println(Time_Complexity.sum2(new int[]{-2,3,4,6,8,10,12,13},26));
        System.out.println(Time_Complexity.sum3(new int[]{-2, 3, 5, 7, 12},17));
        System.out.println(Time_Complexity.limit3(new int[] {-8, -7, -5, -3, -2, 5, 8}));
        System.out.println(Time_Complexity.count(new int[]{1,2,2,2,2,3,3,3,3,3,3,3,3,3,6,8},9));
        System.out.println(Time_Complexity.specialBinarySearch(new int[] {-3,-2,7,8},0));
        System.out.println(Time_Complexity.fixedPoint(new int[]{-3,-1,0,2,4,7,9,12}));
        System.out.println(Time_Complexity.minAbsSum(new int[]{-111,-28,-6,12,14,27}));
        /**openU answer I think its wrong**/
        System.out.println(Time_Complexity.minAbsSumOpenU(new int[]{-1111,-288,-66,12,14,27}));
        System.out.println(Time_Complexity.twoPartSorted(new int[]{0,2,1,4,3,6,7,8,11,9,14,18,15,20},36));
        System.out.println(Time_Complexity.findMax(new int[]{13,16,30,31,-7,-4,1,4,9}));
        int[][] matrio = {{1,   3,  7,  9},
                          {6,   4, 15, 11},
                          {36, 50, 21, 22},
                          {60, 55, 30, 26}};
    int[][] matrix =
                                            {{1,   2,   8,   9,   40,  42,  47,  49},
                                             {6,   4,   11,  10,  46,  44,  52,  51},
                                             {18,  28,  12,  13,  68,  73,  57,  59},
                                             {39,  38,  16,  14,  78,  74,  62,  61},
                                             {106, 108, 114, 116, 79,  80,  87,  89},
                                             {112, 110, 120, 118, 83,  81,  92,  91},
                                             {141, 150, 121, 124, 101, 102, 94,  95},
                                             {160, 155, 131, 128, 105, 103, 100, 97}};
        int num = 78;
        System.out.println(Time_Complexity.search(matrix,num));

        int[] arr = {1,1,0,0,1,1,0,1,1,1,1,0,1};
        System.out.println(Time_Complexity.longestSequence(arr,2));
        System.out.println(Time_Complexity.findMissingIndex(new int[]{2,4,6,10}));
        System.out.println(Time_Complexity.longestSubArray(new int[]{1,-9,-9,2,-3,4,-5,-5,1,-3,2,-5,3}));
        System.out.println(Time_Complexity.findTrilet(new int[] {10,12,11}));


    }



}

