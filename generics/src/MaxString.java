public class MaxString{
    public String[] arr;

    MaxString(int N) {
        this.arr = new String[N];
    }

    public String getMaxValue() {
        String max = this.arr[0];

        for (String value : arr) {
            if (max.compareTo(value) < 0)
                max = value;
        }

        return max;
    }

    public static void main(String[] args) {
        MaxString max = new MaxString(3);

        max.arr[0] = "India";
        max.arr[1] = "USA";
        max.arr[2] = "Canada";

        System.out.println("String Array");
        System.out.println("Maximum value: " + max.getMaxValue());
    }

}
