import java.io.*;
import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            lists.add(new ArrayList<Integer>());
        }
        int q = sc.nextInt();
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 1) {
                lists.get((sc.nextInt() ^ lastans) % n).add(sc.nextInt());
            } else {
                ArrayList<Integer> l = lists.get((sc.nextInt() ^ lastans) % n);
                lastans = l.get(sc.nextInt() % l.size());
                System.out.println(lastans);
            }
        }
    }
}