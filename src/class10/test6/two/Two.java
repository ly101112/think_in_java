package class10.test6.two;

import class10.test6.one.*;

public class Two {
    protected class InnerTwo implements One {
        public InnerTwo() {
            System.out.println("new InnerTwo");
        }

        @Override
        public int value() {
            return 0;
        }
    }
}
