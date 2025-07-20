package Algorithms.Binary_Search;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {
                5, 9, 13, 17, 22, 25, 28, 31, 34, 37, 39, 42, 45, 48, 52, 55, 58, 60, 63, 66,
                69, 72, 74, 77, 80, 83, 86, 88, 91, 94, 97, 99, 103, 106, 109, 112, 115, 118, 121, 124,
                127, 130, 133, 135, 138, 141, 144, 147, 150, 153, 156, 158, 161, 164, 167, 170, 173, 176, 179, 182,
                185, 187, 190, 193, 196, 199, 202, 205, 208, 211, 214, 217, 219, 222, 225, 228, 231, 234, 237, 240,
                243, 246, 249, 251, 254, 257, 260, 263, 266, 269, 272, 275, 278, 281, 284, 286, 289, 292, 295, 298,
                301, 304, 307, 310, 313, 316, 319, 321, 324, 327, 330, 333, 336, 339, 342, 345, 348, 351, 354, 357,
                360, 363, 366, 368, 371, 374, 377, 380, 383, 386, 389, 392, 395, 398, 401, 403, 406, 409, 412, 415,
                418, 421, 424, 427, 430, 433, 436, 438, 441, 444, 447, 450, 453, 456, 459, 462, 465, 468, 471, 474,
                477, 480, 483, 485, 488, 491, 494, 497, 500, 503, 506, 509, 512, 515, 518, 521, 524, 527, 530, 533,
                536, 539, 542, 544, 547, 550, 553, 556, 559, 562, 565, 568, 571, 574, 577, 580, 583, 586, 589, 592
        };
        int target = 72;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
