/******************************************************************************
 *  Compilation:  javac R05_OBJ01_J.java
 *  Execution:    java R05_OBJ01_J
 *
 * shows the danger of publically accessable fields to produce incorrect results.
 *
 ******************************************************************************/
public class R05_OBJ01_J {

    public static void main(String[] args) {
        Widget widget = new Widget();

        System.out.println("widget total before 5 add statements: " + widget.getTotal());
        widget.add();
        widget.add();
        widget.add();
        widget.add();
        widget.add();
        // NO LONGER COMPILES // widget.total += 50; //abuse the accessability of the field
        System.out.println("widget total after 5 add statements: " + widget.getTotal());

    }


    public static class Widget {

        /*
         * Rule 05. Object Orientation(OBJ)
         * Corrected code per:
         * https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
         *
         * Rule 05-OBJ01
         */
        private int total; // Declared private

        public int getTotal () {
            return total;
        }

        void add() {
            if (total < Integer.MAX_VALUE) {
                total++;
                // ...
            } else {
                throw new ArithmeticException("Overflow");
            }
        }

        void remove() {
            if (total > 0) {
                total--;
                // ...
            } else {
                throw new ArithmeticException("Overflow");
            }
        }
    }

}
