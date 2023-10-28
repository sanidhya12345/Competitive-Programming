package Prep.src;
public class MedianOfTwoSortedArrays {
    public static double findMedian(int [] A,int [] B){
        int m=A.length;
        int n=B.length;
        if((m+n)%2!=0){
            return (double) findk(A,B,(m+n)/2,0,m-1,0,n-1);
        }
        else{
            return (findk(A,B,(m+n)/2,0,m-1,0,n-1)+findk(A,B,(m+n)/2-1,0,m-1,0,n-1))*0.5;
        }
    }
    private static int findk(int [] A,int [] B,int k,int aStart,int aEnd,int bStart,int bEnd){
        int aLen=aEnd-aStart+1;
        int bLen=bEnd-bStart+1;

        //handle special cases

        if(aLen==0){
            return B[bStart+k];
        }
        if(bLen==0){
            return A[aStart+k];
        }
        if(k==0){
            return A[aStart]<B[bStart]?A[aStart] :B[bStart];
        }

        int aMid=aLen*k/(aLen+bLen);
        int bMid=bLen*k/(aLen+bLen);

        aMid=aMid+aStart;
        bMid=bMid+bStart;

        if(A[aMid]>B[bMid]){
            k=k-(bMid-bStart+1);
            aEnd=aMid;
            bStart=bMid+1;
        }
        else{
            k=k-(aMid-aStart+1);
            bEnd=bMid;
            aStart=aMid+1;
        }
        return findk(A,B,k,aStart,aEnd,bStart,bEnd);
    }
    public static void main(String[] args) {
        int [] A={1,3};
        int [] B={2};
        System.out.println(findMedian(A,B));
    }
}
