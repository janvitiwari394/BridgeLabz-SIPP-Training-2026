public class RandomNumbers {
    public static void main(String[] args) {
        int arr[] = new int[5];

        for(int i=0;i<5;i++) {
            arr[i] = 1000 + (int)(Math.random()*9000);
            System.out.println(arr[i]);
        }

        int min = arr[0], max = arr[0], sum = 0;

        for(int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double)sum / arr.length;

        System.out.println("Average = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}