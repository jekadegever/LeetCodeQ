public class Main {


    public static void main(String[] args) {

        //sortMod(new int[]{35,17,13,252,4,128,7,3,81},10);
        //System.out.println(equalParts(new int[]{4,3,2,1,2,2}));
        //System.out.println(sum2(new int[]{-2,3,4,6,8,10,12,13},26));
        //System.out.println(sum3(new int[]{-2, 3, 5, 7, 12},17));
        //System.out.println(limit3(new int[] {-8, -7, -5, -3, -2, 5, 8}));
        //System.out.println(count(new int[]{1,2,2,2,2,3,3,3,3,3,3,3,3,3,6,8},9));
        //System.out.println(specialBinarySearch(new int[] {-3,-2,7,8},0));
        //System.out.println(fixedPoint(new int[]{-3,-1,0,2,4,7,9,12}));
        //System.out.println(minAbsSum(new int[]{-111,-28,-6,12,14,27}));
        /**openU answer I think its wrong**/
        //System.out.println(minAbsSumOpenU(new int[]{-1111,-288,-66,12,14,27}));
        //System.out.println(twoPartSorted(new int[]{0,2,1,4,3,6,7,8,11,9,14,18,15,20},36));
        //System.out.println(findMax(new int[]{13,16,30,31,-7,-4,1,4,9}));
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
        //System.out.println(search(matrix,num));

        int[] arr = {1,1,0,0,1,1,0,1,1,1,1,0,1};
       // System.out.println(longestSequence(arr,2));
       // System.out.println(findMissingIndex(new int[]{2,4,6,10}));
        //System.out.println(longestSubArray(new int[]{1,-9,-9,2,-3,4,-5,-5,1,-3,2,-5,3}));
        System.out.println(findTrilet(new int[] {10,12,11}));


    }





    /******************** question 1 ***************************/
    public static void sortMod(int[] a, int k) {

        int cur = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] % k == i) {
                    int temp = a[j];
                    a[j] = a[cur];
                    a[cur] = temp;
                    cur++;
                }
            }
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ,");
        }
    }
    /********************* end of question 1 **********************/
    /*
     *
     *
     *
     *
     */
    /********************** question 2 ***************************/
    public static boolean equalParts(int[] a) {
        int right = 0;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            right += a[i];
        }

        for (int i = a.length - 1; i >= 0; i--) {
            left += a[i];
            right -= a[i];
            if (left == right) {
                return true;
            }
        }
        return false;
    }
    /************************* end of question 2 ********************/
    /*
     *
     *
     *
     *
     */
    /********************* question 3 *****************************/
    //hard sorted array
    public static boolean sum2(int[] a, int num) {
        int i=0;
        int k = a.length-1;

        while(k>i) {
            if(a[i] + a[k] == num) {
                return true;
            }
            if(a[i] + a[k] > num) {
                k--;
            }
            else {
                i++;
            }
        }
        return false;

    }
    /**************************** end of question 3 ***********************/
    /*
     *
     *
     *
     *
     */
    /************************** question 4 *******************************/
    public static boolean sum3(int[] a, int num) {
         for (int i = 0; i < a.length; i++) {
             int temp = a[i];
             a[i]= Integer.MIN_VALUE;

             if(sum2(a,num-temp)) {
                 return true;
             }
             a[i] = temp;
         }
         return false;
    }
    /************************** end of question 4 ************************/
    /*
     *
     *
     *
     *
     */
    /************************** question 5 ******************************/
    //no zero in array
    //hard sorteed
    public static boolean limit3(int[] arr){

      int left=0;
      int right=0;
      int mid=0;
      int limit1 = 0;
      int limit2 = arr.length-1;

        //calculate sum
        for(int i=0;i<arr.length;i++){
            mid += arr[i];
        }


        while(limit1<limit2){
            if(mid == 0 && left <0 && right >0){
                return true;
            }
            else if(mid > 0){
                mid -= arr[limit2];
                right+=arr[limit2];
                limit2--;
            }
            else if(mid < 0){
                mid -= arr[limit1];
                left+=arr[limit1];
                limit1++;
            }

        }
        return false;
    }
    /************************* end of question 5 *********************/
    /*
     *
     *
     *
     *
     */
    /*********************** question 6 **************************/
    public static int count(int[] a, int num){

        return specialBinarySearch(a,num+0.5)-specialBinarySearch(a,num-0.5);


    }
    /********************** end of question 6 *********************/
    /*
     *
     *
     *
     *
     */
    /***************** qeustion 7 *******************/
    public static int fixedPoint(int[] a){

        int low =0;
        int high = a.length-1;
        int mid= (low + high)/2;

        while(low<=high){
            if(a[mid] == mid){
                return mid;
            }
            else if(a[mid] > mid){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
            mid= (low+high)/2;
        }

        return -1;
    }
    /*************** end of question 7 ***************/
    /*
    *
    *
    *
    *
     */
    /*********** question 8 ******************/
    public static int minAbsSum(int[] a){

        int mid = specialBinarySearch(a, 0);

        if(a.length==2){
            return Math.abs(a[0])+Math.abs(a[1]);
        }

        else if(a.length==3 || mid==1){
            return Math.min(Math.abs(a[0])+Math.abs(a[1])  ,  Math.abs(a[1])+Math.abs(a[2]));
        }
        else {
            if (mid == 0) {
                return Math.abs(a[mid]) + Math.abs(a[mid + 1]);
            } else if (mid == a.length - 1) {
                return Math.abs(a[mid]) + Math.abs(a[mid - 1]);
            } else {
                return Math.min(Math.min(Math.abs(a[mid]) + Math.abs(a[mid + 1]) ,Math.abs(a[mid])+Math.abs(a[mid-1])), Math.abs(a[mid-2])+Math.abs(a[mid-1]));
            }
        }
    }
    /****************** end of question 8 ************************/

    /************ question 8 openU *******************/
    public static int minAbsSumOpenU(int[] a) {
        if (a[0] >= 0)
            return Math.abs(a[0]) + Math.abs(a[1]);
        else if (a[a.length - 1] <= 0)
            return Math.abs(a[a.length - 1]) + Math.abs(a[a.length - 2]);

        int zeroLocation = binarySearch(a, 0);
        if (zeroLocation!= -1 && a[zeroLocation] == 0)
            return Math.min(Math.abs(a[zeroLocation + 1]), Math.abs(a[zeroLocation - 1]));
        return Math.abs(a[zeroLocation]) + Math.abs(a[zeroLocation - 1]);
    }
    /*********** ens od openU question 8 *************/



    /************** question 9 *********************/
    public static boolean twoPartSorted(int[] a, double num) {
        int low=0;
        int high=a.length-1;
        int mid = low+(high-low)/2;

        while(low<=high){
            if(mid==a.length-1) {
                return false;
            }
            if (a[mid] + a[mid + 1] == num) {
                return true;
            }

            else if(a[mid]+a[mid+1]>num){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
            mid= low+(high-low)/2;
        }
        //normally is return -1 if num ot found
        return false;
    }
    /*************** end of question 9 *********************/


    public static int findMax(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int temp = arr[high];
        int mid = (low + high)/2;
        String jumpedTo = "left";

        if(arr.length == 1)
            return arr[0];
        else if(arr.length == 2)
            return Math.max(arr[0], arr[1]);
        else if (arr[high] > arr[low])
            return arr[high];

        else{


            while(low<=high){
                if(mid == 0){
                    if(arr[0] > arr[1])
                        return arr[0];
                }
                else if(mid == arr.length - 1){
                    if(arr[mid] < arr[mid-1])
                        return arr[mid-1];
                }
                else if(arr[mid] > arr[mid+1]){
                    return arr[mid];
                }
                else{
                    if (jumpedTo.equals("left")){
                        if(arr[mid] < temp){
                            temp =arr[mid];
                            high = mid-1;
                            mid = (low+high)/2;

                        }
                        else{
                            temp = arr[mid];
                            jumpedTo = "right";
                            low = mid+1;
                            mid = (low+high)/2;
                        }
                    }
                    else{
                        if(arr[mid] > temp){
                            temp =arr[mid];
                            low = mid+1;
                            mid = (low+high)/2;
                        }
                        else{
                            temp = arr[mid];
                            jumpedTo = "left";
                            high = mid-1;
                            mid = (low+high)/2;
                        }
                    }
                }
            }
        }
     return -1;
    }


    /******************************* moed 92 2021b **************************/
    public static int longestSequence(int[] a, int k){
        int i = 0, maxCount = 0, curCount = 0,zeroFound = k;
        int[] zeros = new int[a.length];
        int ZeroI = 0, zeroused = 0;;


        while(i < a.length){
            if(a[i] == 0){
                zeros[ZeroI] = i;//add zero index to array
                ZeroI++;//next zero index to insert
                if(zeroFound > 0){
                    zeroFound--;//delete zero accepted
                    curCount++;//increment count
                    i++;//increment index

                }else{
                    zeroFound = k;
                    if(maxCount < curCount)
                        maxCount = curCount;
                    curCount = 0;
                    i = zeros[zeroused]+1;
                    zeroused++;

                }
            } else {
                curCount++;
                i++;
            }
        }
        return curCount > maxCount ? curCount:maxCount;
    }
    /********************************** moed 92 2021b end *****************************/

    /********************************* modec 6x 2021 *****************************/
    public static boolean search (int[][] mat, int num){
        /**"top left" = [left],[right]  "top right" = [left],[right+factor]  "bottom left" = [left+factor],[right] | "bottom right" = [left+factor],[right+factor] = */

        int factor = mat.length/2;
        int X =0;
        int Y =0;
        int pointer = mat[factor][0];
        int pointX = factor;
        int pointY = 0;

        while(factor > 0) {

            int topLeftMn = mat[X][Y];
            int topRightMn = mat[X][Y+factor];
            int bottomLeftMn = mat[X+factor][Y];
            int bottomRightMn = mat[X+factor][Y+factor];

            if (pointer == num) {
                System.out.println("number: " + num + " found in {" + pointX + "," + pointY + "}");
                return true;
            }
            else if (num > pointer) {
                if (factor / 2 != 0) {
                    if(pointer == bottomLeftMn){
                        X += factor;
                    }
                    else if(pointer == bottomRightMn){
                        X += factor;
                        Y += factor;
                    }
                    else if(pointer == topRightMn){
                        Y += factor;
                    }
                    factor = factor / 2;
                    bottomLeftMn = mat[X+factor][Y];
                    pointer = bottomLeftMn;
                    pointX = X+factor;
                    pointY = Y;
                } else
                    break;
            }
            else if (pointer == bottomLeftMn) {/**in bottom left quatat*/
                    pointer = bottomRightMn;//to smaller quatar
                    pointX = X+factor;
                    pointY = Y+factor;

            } else if (pointer == bottomRightMn) {/** in bottom right quatat*/
                    pointer = topRightMn;//to smaller quatar
                    pointX = X;
                    pointY = Y+factor;

            } else if (pointer == topRightMn) {/** in top right quatar*/
                    pointer = topLeftMn;//to smaller quatar
                    pointX = X;
                    pointY = Y;

            } else {/** in top left quator*/
                    return false;
            }
        }
        return false;
    }/********************************* modec 6x 2021 end *****************************/



    /******************************* moed 67 2022 a ****************************************/

    public static int findMissingIndex(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = (high+low)/2;
        int factor, leftDiff,rightDiff;

        leftDiff = arr[mid]-arr[mid-1];
        rightDiff = arr[mid+1]-arr[mid];
        factor= leftDiff>rightDiff? rightDiff:leftDiff;



        while(low<=high){
            System.out.println("mid= "+mid);


            if(mid!=0 && mid!= arr.length-1 && arr[mid]-arr[mid-1] != factor){
                    return mid;
            }
            else if(  mid!=0 && mid!= arr.length-1&& arr[mid+1]-arr[mid] != factor){
                    return mid+1;
            }

            else if(mid==0 && arr[mid+1] - arr[mid] != factor){
                    return mid+1;
            }
            else if(mid == arr.length-1 && arr[mid] - arr[mid-1] != factor){
                    return mid;
            }
            else{//2 diffs equal

                if(arr[mid]+(high-mid)*factor == arr[high]){//if true, missing index in left side
                    high = mid-1;
                }
                else{//missing index in right site
                    low = mid+1;
                }
            }
            mid= (high+low)/2;
        }
        return arr.length;
    }

    /******************************* moed 67 2022 a end ************************************/




    /******************************* moed 89 2022 a  ***************************************/

    public static int longestSubArray(int[] arr){
        int curSum = 1, maxSum = 0, startIn=0,maxHigh=0, maxLow=0;
        int flag = (arr[0] > 0) ? 1 : -1;//1 - poaitive , -1 negative

        for(int i = 1; i <= arr.length; i++){
            if(i==arr.length){
                if(curSum > maxSum){
                    maxSum = curSum;
                    maxHigh = i-1;
                    maxLow = startIn;
                }
            }
            else if(arr[i] > 0 && flag == -1){
                curSum++;
                flag = 1;
            }
            else if(arr[i] < 0 && flag == 1){//stem.out.println(longestSubArray(new int[]{1,-9,-9,2,-3,4,-5,-5,1,-3,2,-5,3}));
                curSum++;
                flag =-1;
            }
            else{
                if(curSum > maxSum){
                    maxSum = curSum;
                    curSum = 1;
                    maxHigh = i-1;
                    maxLow = startIn;
                    startIn = i;


                }
                else{
                    curSum = 0;
                    startIn = i;
                }
                flag = (arr[i] > 0) ? 1 : -1;
            }
        }


        System.out.println("start index= "+maxLow);
        System.out.println("end index= "+maxHigh);
        return maxSum;
    }



    /******************************* moed 89 2022 a end ************************************/



    /******************************* moed 91 2022 b ****************************************/

    public static int findTrilet(int[] arr){

        int[] arrCpy = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arrCpy[i] = arr[i];
        }

        int index = findMaxx(arr);
        int max1 = arr[index];
        arr[index]= Integer.MIN_VALUE;

          index = findMaxx(arr);
        int max2 = arr[index];
        arr[index]= Integer.MIN_VALUE;

        index = findMaxx(arr);
        int max3 = arr[index];

        index = findMin(arrCpy);
        int min1 = arr[index];
        arrCpy[index]= Integer.MAX_VALUE;

        index = findMin(arrCpy);
        int min2 = arr[index];

        int sum1 = min1*min2*Math.max(Math.max(max1,max2),max3);
        int sum2 = max1*max2*max3;

        return Math.max(sum1,sum2);




    }

    private static int findMaxx(int[] arr){
       int max = 0;
        for(int i = 1; i<arr.length; i++){
           if(arr[i] > arr[max]){
               max = i;
           }
       }
        return max;
    }

    private static int findMin(int[] arr){
        int MIN = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[MIN]){
                MIN = i;
            }

        }
        return MIN;
    }

    /******************************* moed 91 2022 b end ************************************/




/********************** UTIL *****************/
    //special for question count
    public static int specialBinarySearch(int[] a, double num) {
        int low=0;
        int high=a.length-1;
        int mid = low+(high-low)/2;

        while(low<=high){
            if(a[mid]==num){
                return mid;
            }
            else if(a[mid]>num){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
            mid= low+(high-low)/2;
        }
        //normally is return -1 if num ot found
        return mid;
    }




    private static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }


}//end of main class

