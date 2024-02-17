public class RemoveConsecutiveDuplicates {

    public static void display(String str, StringBuilder sb) {
        System.out.println("Duplicate string : " + str);
        System.out.println();
        System.out.println("Original string : " + sb);
    }

    public static void remove(char[] arr, StringBuilder sb, int idx, int jdx) {
        if (jdx == arr.length)
            return;
        if (arr[idx] != arr[jdx]) {
            sb.append(arr[jdx]);
            idx++;
        } else {
            idx++;
        }
        remove(arr, sb, idx, jdx + 1);
    }

    public static void main(String[] args) {
        String str = "AAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDDDDDDDDDDDDDDDDDDDDDEEEEEEEEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGHHHHHHHHHHHHHHHHHHHHHHIIIIIIIIIIIIIIJJJJJJJJJJKKKKKKKLLLLMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNNNNOOOOOOOOOOOOOOOOOOOOOOOPPPPPPPPPPPPPPPPQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYZ";
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        remove(arr, sb, 0, 1);
        display(str, sb);

    }
}