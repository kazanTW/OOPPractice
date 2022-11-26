import java.util.Arrays;
import java.util.Scanner;

public class SearchDemo {
	public static void main(String args[]) {
        MySearchable s2 = new BinarySearchTree();
        Integer[] items = Arrays.stream(args).map(Integer::parseInt).toArray(Integer[]::new);

        for (int i = 0; i < 32; i++) s2.put(items[i]);
	}
}
