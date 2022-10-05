public class Main {
    public static void main(String[] args) {
        int numbers[] = {2,2,3,4};
        System.out.println(uniques(numbers));
    }

    static boolean uniques(int[] numbers){
        for (int i=0;i<=numbers.length-1;i++)
        {
            for(int j=numbers.length-1;j>-1;j--) {
                if (numbers[i] == numbers[j] && i!=j)
                {
                    System.out.println("the " + (i+1) + " and " + (j+1) + " elements are the same");
                    return true;
                }
            }
        }
        return false;
    }
}