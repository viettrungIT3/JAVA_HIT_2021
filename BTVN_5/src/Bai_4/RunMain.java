package Bai_4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer>SumI = new Sum<Integer>(4,3);
        System.out.println("Sum of type Interger = " + (SumI.getSoA() + SumI.getSoB()));

        Sum<Long>SumL = new Sum<Long>(4L , 3L);
        System.out.println("Sum of type Long = " + (SumL.getSoA() + SumL.getSoB()));

        Sum<Float>SumF = new Sum<Float>(4.3F , 3.4F);
        System.out.println("Sum of type Float = " + (SumF.getSoA() + SumF.getSoB()));

        Sum<Double>SumD = new Sum<Double>(4.3d , 3.4d);
        System.out.println("Sum of type Double = " + (SumD.getSoA() + SumD.getSoB()));
    }
}
