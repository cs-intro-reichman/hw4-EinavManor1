

public class TesterArrayCharOps {

    public static void main(String[] args) {
        testCharAt();
        testEquals();
        testIndexOf();
        testConcat();
        testSubArray();
        testCompareTo();
        testHashCode();
    }

    private static void testCharAt() {
        int num_tests = 4;
        System.out.println("Testing 'charAt':");

        char[] arr1 = "A wizzard is never late".toCharArray();
        boolean test1 = ArrCharOps.charAt(arr1, 2) == 'w';
        boolean test2 = ArrCharOps.charAt(arr1, 5) == 'z';
        boolean test3 = ArrCharOps.charAt(arr1, 9) == ' ';
        boolean test4 = ArrCharOps.charAt(arr1, arr1.length - 1) == 'e';

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }


    private static void testEquals() {
        int num_tests = 3;
        System.out.println("Testing 'equals':");

        char[] arr1 = "You know nothing John Snow".toCharArray();
        char[] arr2 = "You know nothing john snow".toCharArray();
        char[] empty_arr = {};

        boolean test1 = !ArrCharOps.equals(arr1, arr2);
        boolean test2 = ArrCharOps.equals(arr1, arr1);
        boolean test3 = ArrCharOps.equals(empty_arr, empty_arr);

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testIndexOf() {
        int num_tests = 7;
        System.out.println("Testing 'indexOf' functions:");

        char[] empty_arr = {};
        char[] arr1 = "You are a wizard Harry.".toCharArray();

        boolean test1 = ArrCharOps.indexOf(arr1, 'w') == 10;
        boolean test2 = ArrCharOps.indexOf(arr1, 'w', 5) == 10;
        boolean test3 = ArrCharOps.indexOf(arr1, 'w', 12) == -1;
        boolean test4 = ArrCharOps.indexOf(arr1, 'G') == -1;
        boolean test5 = ArrCharOps.indexOf(empty_arr, 'w') == -1;

        boolean test6 = ArrCharOps.lastIndexOf(arr1, 'r') == 20;
        boolean test7 = ArrCharOps.lastIndexOf(arr1, 'B') == -1;

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + (test4 ? 1 : 0) +
                     (test5 ? 1 : 0) + (test6 ? 1 : 0) + (test7 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testConcat() {
        int num_tests = 3;
        System.out.println("Testing 'concat':");

        char[] empty_arr = {};
        char[] arr1 = "I am the ".toCharArray();
        char[] arr2 = "eggman".toCharArray();
        char[] arr3 = "walrus".toCharArray();

        boolean test1 = ArrCharOps.equals(ArrCharOps.concat(arr1, arr2), "I am the eggman".toCharArray());
        boolean test2 = ArrCharOps.equals(ArrCharOps.concat(arr1, arr3), "I am the walrus".toCharArray());
        boolean test3 = ArrCharOps.equals(ArrCharOps.concat(empty_arr, arr3), arr3);

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testSubArray() {
        int num_tests = 2;

        System.out.println("Testing 'subArray':");
        char[] arr1 = "Somebody stop me".toCharArray();
        boolean test1 = ArrCharOps.equals(ArrCharOps.subArray(arr1, 0, 8), "Somebody".toCharArray());
        boolean test2 = ArrCharOps.equals(ArrCharOps.subArray(arr1, 9, 16), "stop me".toCharArray());

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "(Failed)";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testCompareTo() {
        int num_tests = 4;
        System.out.println("Testing 'compareTo':");

        boolean test1 = ArrCharOps.compareTo("abc", "abc") == 0;
        boolean test2 = ArrCharOps.compareTo("abc", "aBc") == 1;
        boolean test3 = ArrCharOps.compareTo("abc", "abcd") == -1;

        int res = ArrCharOps.compareTo("abc", "");
        boolean test4 = res != 0 && res != -1 && res != 1;

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0)+ (test4 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testHashCode() {
        int num_tests = 3;
        System.out.println("Testing 'hashCode':");

        char[] arr1 = {'a'};
        char[] arr2 = "lemon".toCharArray();
        char[] arr3 = {};

        boolean test1 = ArrCharOps.hashCode(arr1) == (long) 97;
        boolean test2 = ArrCharOps.hashCode(arr2) == (long) 300179;
        boolean test3 = ArrCharOps.hashCode(arr3) == (long) 0;

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict); 
    }
}
