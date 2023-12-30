public class MaxInteger {
    public Integer[] arr;

    MaxInteger(int N) {
        this.arr = new Integer[N];
    }

    public Integer getMaxValue() {
        Integer max = this.arr[0];

        for (Integer value : arr) {
            if (max.compareTo(value) < 0)
                max = value;
        }

        return max;
    }

    public static void main(String[] args) {
        MaxInteger max = new MaxInteger(3);

        max.arr[0] = 1;
        max.arr[1] = 2;
        max.arr[2] = 3;

        System.out.println("Integer Array");
        System.out.println("Maximum value: " + max.getMaxValue());
    }

}
