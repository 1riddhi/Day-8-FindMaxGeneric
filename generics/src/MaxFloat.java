public class MaxFloat{
    public Float[] arr;

    MaxFloat(int N) {
        this.arr = new Float[N];
    }

    public Float getMaxValue() {
        Float max = this.arr[0];

        for (Float value : arr) {
            if (max.compareTo(value) < 0)
                max = value;
        }

        return max;
    }

    public static void main(String[] args) {
        MaxFloat max = new MaxFloat(3);

        max.arr[0] = (float) 1.5;
        max.arr[1] = (float) 2.5;
        max.arr[2] = (float) 3.5;

        System.out.println("Float Array");
        System.out.println("Maximum value: " + max.getMaxValue());
    }

}
