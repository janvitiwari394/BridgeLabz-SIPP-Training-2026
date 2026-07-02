class Subsets {
    static void generate(int arr[], int index, String current) {
        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        generate(arr, index + 1, current);

        if (current.equals(""))
            generate(arr, index + 1, current + arr[index]);
        else
            generate(arr, index + 1, current + "," + arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2};
        generate(arr, 0, "");
    }
}