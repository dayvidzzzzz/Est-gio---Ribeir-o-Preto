public class C {
    public static void main(String[] args) {
        int[] array = {0, 1, 4, 9, 16, 25, 36};
        int[] novoArray;

        novoArray = crescerArray(array);
        novoArray[novoArray.length - 1] = (int) Math.pow(7,2);

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
