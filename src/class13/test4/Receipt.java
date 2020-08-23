/**
 * 第十三章练习4 格式化输出
 */
package class13.test4;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    private static final int WIDTH1 = 20;
    private static final int WIDTH2 = 5;
    private static final int WIDTH3 = 10;
    private String s1 = "%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + "s\n";
    private String s2 = "%-" + WIDTH1 + ".15s %" + WIDTH2 + "d %" + WIDTH3 + ".2f\n";
    private String s3 = "%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + ".2f\n";

    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(s3, "Tax", "", total * 0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
