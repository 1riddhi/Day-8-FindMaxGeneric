public class Generic<T extends Comparable<T>> {

    public T getMax(T[] arr) {
        T maxi = arr[0];
        for (T element : arr) {
            if (maxi.compareTo(element) < 0) {
                maxi = element;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        
        Float[] floatArray = {1.5f, 2.5f, 3.5f};
        Generic<Float> floatObj = new Generic<>();
        System.out.println("Max Float: " + floatObj.getMax(floatArray));

       
        String[] stringArray = {"apple", "orange", "banana"};
        Generic<String> stringObj = new Generic<>();
        System.out.println("Max String: " + stringObj.getMax(stringArray));

        
        Integer[] intArray = {10, 5, 8};
        Generic<Integer> intObj = new Generic<>();
        System.out.println("Max Integer: " + intObj.getMax(intArray));
    }
}
