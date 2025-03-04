package JavaPrograms;

public class ArrayLab001 {
    public static void main (String[] args){

    // 1D Array
    // Declaration
        int [] a = new int [3];

    //Initialization
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

    //Print value using index number
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

    // Print value using For Each loop
        for (int i:a)
        {
            System.out.print(i+" ");
        }

        System.out.println("\n Initializing array in one line");

        int [] b = new int[] {5,6,7,8};

        for(int j : b)
        {
            System.out.print(j);
        }

        System.out.println("\n Initializing array in one line WITHOUT NEW");

        int [] c = {9, 10, 11};

        for (int k:c){
            System.out.print(k);
        }

    }
}
