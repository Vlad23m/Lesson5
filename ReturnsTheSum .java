class ReturnsTheSum {

    static int arr[] = {10, 10, 10, 100};

    static int sum()
    {
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of a given array: " + sum());
    }



}
