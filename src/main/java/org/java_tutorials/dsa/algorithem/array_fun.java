package org.java_tutorials.dsa.algorithem;

public class array_fun {
    public static void main(String[] args) {
        //int[] a = new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3};
        /*int[] a = randomArray(50000000)[0];
        long start = System.currentTimeMillis();
        int[] k=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            k[i]=a[i];
        }
        //find_possible_sum(a[0],192);
        int[] b = new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3};
        System.out.println(Arrays.toString(remove_repeated_element(a)));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("Copied");
        start = System.currentTimeMillis();
       // var k2 = algo(a);
        //System.out.println(System.currentTimeMillis() - start);
        //System.out.println(Arrays.toString(k1));
        //System.out.println(Arrays.toString(k2));
*/
        System.out.println(Is_walkable(new int[]{4,3,0,2,1,5,3}));
    }

    static int[] algo(int[] arr) {
        int[] nArr = new int[arr.length];
        nArr[0] = arr[0];
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < k; j++) {
                int value = nArr[j];
                if (arr[i] == value) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                nArr[k] = arr[i];
                k++;
            }

        }
        return nArr;
    }

    private static int[][] randomArray(int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        for (int j = 0; j < n; j++) {
            int con = (int) (Math.random() * (n - j) + 2);
            a[j] = con;
            b[j] = con;
        }
        System.out.println("Array is filled");
        return new int[][]{a, b};
    }

    static int[] remove_repeated_element(int[] arr) {
        int[] nArr = new int[arr.length];
        int start, end, mid = 0, k = 0;
        nArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > nArr[k]) {
                nArr[k + 1] = arr[i];
                k++;
            } else if (arr[i] < nArr[0]) {
                System.arraycopy(nArr, 0, nArr, 1, k + 1);
                nArr[0] = arr[i];
                k++;
            } else if (nArr[0] != arr[i] && nArr[k] != arr[i]) {
                end = k;
                start = 0;
                while ((end - start) != 1) {
                    mid = (end + start) / 2;
                    if (arr[i] == nArr[mid])
                        break;
                    else if (nArr[mid] > arr[i])
                        end = mid;
                    else if (nArr[mid] < arr[i])
                        start = mid;
                }
                if (nArr[mid] < arr[i]) {
                    if (k + 1 - (mid + 1) >= 0)
                        System.arraycopy(nArr, mid + 1, nArr, mid + 1 + 1, k + 1 - (mid + 1));
                    nArr[mid + 1] = arr[i];
                    k++;
                } else if (nArr[mid] > arr[i]) {
                    if (k + 1 - mid >= 0)
                        System.arraycopy(nArr, mid, nArr, mid + 1, k + 1 - mid);
                    nArr[mid] = arr[i];
                    k++;
                }
            }
        }
        return nArr;
    }

    static int[] binary_sort(int[] arr) {
        int[] nArr = new int[arr.length];
        int start, end, mid = 0, k = 0;
        nArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= nArr[k]) {
                nArr[k + 1] = arr[i];
                k++;
            } else if (arr[i] <= nArr[0]) {
                System.arraycopy(nArr, 0, nArr, 1, k + 1);
                nArr[0] = arr[i];
                k++;
            } else {
                end = k;
                start = 0;
                while ((end - start) != 1) {
                    mid = (end + start) / 2;
                    if (arr[i] == nArr[mid]) {
                        if (k + 1 - (mid + 1) >= 0)
                            System.arraycopy(nArr,
                                    mid + 1,
                                    nArr,
                                    mid + 1 + 1,
                                    k + 1 - (mid + 1));
                        nArr[mid + 1] = arr[i];
                        k++;
                        break;
                    } else if (nArr[mid] > arr[i])
                        end = mid;
                    else if (nArr[mid] < arr[i])
                        start = mid;
                }
                if (nArr[mid] < arr[i]) {
                    if (k + 1 - (mid + 1) >= 0)
                        System.arraycopy(nArr,
                                mid + 1,
                                nArr,
                                mid + 1 + 1,
                                k + 1 - (mid + 1));
                    nArr[mid + 1] = arr[i];
                    k++;
                } else if (nArr[mid] > arr[i]) {
                    if (k + 1 - mid >= 0)
                        System.arraycopy(nArr,
                                mid, nArr,
                                mid + 1,
                                k + 1 - mid);
                    nArr[mid] = arr[i];
                    k++;
                }
            }
        }
        return nArr;
    }
    private static void find_possible_sum(int []a,int n){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==n){
                    System.out.println(a[i]+"       "+a[j]);
                }
            }
        }
    }
    private static boolean Is_walkable(int []a){
        int i=a[0],c=0;
        while(i>=0 && i<a.length && a[i]>=0){
            int k=i;
            i=a[i];
            a[k]=-1;
            c++;
        }
        return c==a.length;
    }
}
