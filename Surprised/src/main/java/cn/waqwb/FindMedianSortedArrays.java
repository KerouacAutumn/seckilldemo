package cn.waqwb;

/**
 * @author JokerQ
 * @date 2019/7/31 - 9:34
 */
public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] arrayA,int[] arrayB){
        int m = arrayA.length;
        int n = arrayB.length;
        //�������A�ĳ��ȴ��ڵ�������B���򽻻�����
        if(m>n){
            int[] temp = arrayA;
            arrayA = arrayB;
            arrayB = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int start = 0;
        int end = m;
        int mid = (m+n+1)/2;
        while(start<=end){
            int i = (start+end)/2;
            int j = mid -i;
            if (i<end && arrayB[j-1]>arrayA[i]){
                //iƫС�ˣ���Ҫ����
                start = i+1;
            } else if (i>start && arrayA[i-1]>arrayB[j]){
                //iƫ���ˣ���Ҫ����
                end = i-1;
            } else {
              //i�պú���
                int maxLeft;
                if(i==0){
                    //����A��Ԫ�ض�Ҫ��������B�����
                    maxLeft = arrayB[j-1];
                } else if (j==0){
                    //����A��Ԫ�ض�ҪС������B�����
                    maxLeft = arrayA[i-1];
                } else {
                    maxLeft = Math.max(arrayA[i-1],arrayB[j-1]);
                }
                if ((m+n)%2 == 1){
                    //���������ĳ�������������λ��������벿�ֵ����ֵ
                    return maxLeft;
                }
                int minRight;
                if (i==m){
                    minRight = arrayB[j];
                } else if (j == n){
                    minRight = arrayA[i];
                } else {
                    minRight = Math.min(arrayB[j],arrayA[i]);
                }
                return  (maxLeft+minRight)/2.0;
            }
        }
        return 0.0;

    }

    public static void main(String[] args) {
        int[] arrayA = new int[]{3,5,7,8,12,20};
        int[] arrayB = new int[]{1,11,17,18};
        System.out.println(findMedianSortedArrays(arrayA,arrayB));
    }
}
