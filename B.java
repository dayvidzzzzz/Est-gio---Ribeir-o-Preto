public class B {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 16, 32, 64};
        int[] novoArray;

        novoArray = crescerArray(array);
        novoArray[novoArray.length - 1] = array[array.length - 1] * 2;

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
