public class Main {

    public static void main(String[] args) {

        KenningtonSolution solution = new KenningtonSolution();

        String[] resultArray;
        String result;

        int[] phoneNumber = new int[]{7,0,3,9,0,1,3,4,2,3};


        System.out.println("This:" + "ABC".substring(1,2));

        resultArray = solution.getLetterPermutationsIterative(phoneNumber);
        result = java.util.Arrays.toString(resultArray);
        System.out.println("getLetterPermutationsIterative: " + result);

        resultArray = solution.getLetterPermutationsRecursive(phoneNumber);
        result = java.util.Arrays.toString(resultArray);
        System.out.println("getLetterPermutationsRecursive: " + result);

    }
}

