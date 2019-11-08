/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  Calls function getAbsAdd(x,y) with legal and illegal values
 *
 ******************************************************************************/
public class R06_Met01_J {

    public static void main(String args[]){

        //checks for input valdiation
        int a = 1, b = 2;

        System.out.println("ABS Add (" + a + "," + b + "): ");
        System.out.println(getAbsAdd(a, b));

        //checks for input valdiation
        a = Integer.MIN_VALUE;

        System.out.println("ABS Add (" + a + "," + b + "): ");
        System.out.println(getAbsAdd(a, b));


    }

    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
}


