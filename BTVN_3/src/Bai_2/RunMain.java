package Bai_2;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        System.out.println("  Input data arr1");
        arr1.InputData();
        System.out.println("  Input data arr2");
        arr2.InputData();
        System.out.println();

//        System.out.println("  Show data arr1");
//        arr1.Show();
//        System.out.println("  Show data arr2");
//        arr2.Show();
//        System.out.println();

        if ((1.0*arr1.Sum())/ arr1.getNum() > (1.0*arr2.Sum())/ arr2.getNum()) {
//            System.out.println("The average of arr1 is greater than the average of arr2");
            System.out.println("The average of arr1 > the average of arr2");
        } else if ((1.0*arr1.Sum())/ arr1.getNum() < (1.0*arr2.Sum())/ arr2.getNum()) {
            System.out.println("The average of arr1 < the average of arr2");
        } else {
            System.out.println("Bye");
        }
    }
}
