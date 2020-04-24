package class6;

class Connection{
    Connection[] getArr(int count) {
        Connection[] arr = new Connection[count];
        for (int i = 0; i < count; i++) {
            arr[i] = new Connection();
        }

        return arr;
    }
}

public class ConnectionManage {
    static int count = 4;
    static Connection[] arrConnection = new Connection().getArr(count);

    static Connection getConnection(int x) {
        if (x < count) {
            return arrConnection[x];
        }
        return null;
    }
}
