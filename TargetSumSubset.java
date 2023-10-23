public class TargetSumSubset {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int targetSum = 70;

        printTARGETSUMSUBSETS(array, 0, "", 0, targetSum);
    }

    private static void printTARGETSUMSUBSETS(int[] array, int i, String set, int sos, int targetSum) {
        if (i == array.length) {
            if (sos == targetSum) {
                System.out.println("[" + set.substring(0, set.length() - 2) + "]");
                return;
            }
            return;
        }

        printTARGETSUMSUBSETS(array, i + 1, set + array[i] + " ,", sos + array[i], targetSum);
        printTARGETSUMSUBSETS(array, i + 1, set, sos, targetSum);
    }

}

