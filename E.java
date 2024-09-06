public class E {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};
        int[] novoArray;

        novoArray = crescerArray(array);

        int a = array[novoArray.length - 2];
        int b = array[novoArray.length - 3];
        novoArray[novoArray.length - 1] = a + b;

        for (int i = 0; i < novoArray.length; i++)
            System.out.println(novoArray[i]);
    }

    public static int[] crescerArray(int[] array) {
        int[] novoArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) 
            novoArray[i] = array[i];
        return novoArray;
    }
}
