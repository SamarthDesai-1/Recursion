public class TowerOfHanoi {

    public static void main(String[] args) {
        int disk = 3;
        char t1 = 'A';
        char t2 = 'B';
        char t3 = 'C';

        toh(disk, t1, t2, t3);
    }

    private static void toh(int disk, char t1, char t2, char t3) {
        if (disk == 0)
            return;

        toh(disk - 1, t1, t3, t2); // source destination helper
        System.out.println("[" + t1 + " -> " + t2 + "]");
        toh(disk - 1, t3, t2, t1); // source destination helper
    }

}
