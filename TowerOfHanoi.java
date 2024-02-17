import java.util.Scanner;

public class TowerofHanoi {

    static void move(int disk, char s, char h, char d) {

        if (disk == 0)
            return;
        move(disk - 1, s, d, h);
        System.out.println(s + " -> " + d);
        move(disk - 1, h, s, d);
        return;
    }

    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.print("Enter Disks : ");
        int disk = foo.nextInt();
        move(disk, 'A', 'B', 'C');

    }
}
