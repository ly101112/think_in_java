/**
 * 第十三章练习1
 */
package class13.test1;

class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("valve1 = ");
        stringBuilder.append(valve1);
        stringBuilder.append(" valve2 = ");
        stringBuilder.append(valve2);
        stringBuilder.append(" valve3 = ");
        stringBuilder.append(valve3);
        stringBuilder.append(" valve4 = ");
        stringBuilder.append(valve4);
        stringBuilder.append("\ni = ");
        stringBuilder.append(i);
        stringBuilder.append(" f = ");
        stringBuilder.append(f);
        stringBuilder.append(" source = ");
        stringBuilder.append(waterSource);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
