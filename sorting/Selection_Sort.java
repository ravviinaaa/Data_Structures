package sorting;

public class Selection_Sort {
    public static void selectionsort(int a[]) {
        int minIndex;
        for(int i=0;i<a.length-1;i++) {
            minIndex=i;
            for(int j=i+1;j<a.length;j++) {
                if(a[j]<a[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
    }

    public static void main(String[] args) {
        int a[]= {6,11,28,8,14,18,7,12,12};
        selectionsort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

}