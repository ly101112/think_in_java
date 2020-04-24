import class6.*;
import static class6.debug.Debug.*;// 条件编译
//import static class6.debugoff.Debug.*;// 条件编译

//import java.util.Vector;// 练习2 类库名冲突解决方法1

/**
 * 第六章练习1
 */
public class Class6 {
    public static void main(String[] args) {
        T6 t6 = new T6();
        t6.fx();
//        new Vector();// 练习2 类库名冲突 java.util.Vector 和 class.Vector
//        new java.util.Vector();// 练习2 类库名冲突解决方法2

        debug();
    }
}
