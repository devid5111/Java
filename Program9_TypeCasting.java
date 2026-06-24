public class Program9_TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening): automatically done by Java (smaller to larger type)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value (Implicit cast): " + myDouble);

        // Explicit Casting (Narrowing): must be done manually (larger to smaller type)
        double anotherDouble = 9.78d;
        int anotherInt = (int) anotherDouble; // Manual casting: double to int
        
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Integer value (Explicit cast, decimal dropped): " + anotherInt);
    }
}
