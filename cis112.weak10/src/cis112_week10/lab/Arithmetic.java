package cis112_week10.lab;

public class Arithmetic {

    public static int sum(int a, int b) {
        System.out.println("->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
                + "\ta=" + a + ",b=" + b);
        
        // below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
        // Base Case: When b is 0, the sum is just a.
        if (b == 0) {
            return a;
        }
        // Recursive Case: Add 1 to the result of sum(a, b - 1).
        return sum(a, b - 1) + 1;
        // above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
    }

    public static int prod(int a, int b) {
        System.out.println("->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
                + "\ta=" + a + ",b=" + b);
        
        // below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
        // Base Case: When b is 0, the product is 0.
        if (b == 0) {
            return 0;
        }
        // Recursive Case: Add a to the result of prod(a, b - 1).
        return prod(a, b - 1) + a;
        // above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
    }

    public static int pow(int a, int b) {
        System.out.println("->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
                + "\ta=" + a + ",b=" + b);
        
        // below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
        // Base Case: When b is 0, the power is 1.
        if (b == 0) {
            return 1;
        }
        // Recursive Case: Multiply a with the result of pow(a, b - 1).
        return pow(a, b - 1) * a;
        // above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
    }

}
