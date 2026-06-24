public class Football {
    static int sum(int arr[]) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static int shortest(int arr[]) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static int tallest(int arr[]) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int heights[] = new int[11];

        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + (int)(Math.random() * 101);

        System.out.println("Mean: " + (sum(heights) / heights.length));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}