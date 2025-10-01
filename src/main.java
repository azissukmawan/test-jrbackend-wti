public class main {
    public static void main(String[] args) {

//        int[] array = {9, 1, 8, 2, 7, 3, 10, 6, 4, 5};
        int[] array = {1, 2, 4, 3, 5};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp =  array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

//  kompleksitas algoritma O(n2)
//  runtime berjalan dalam waktu kuadrat
//  jadi semakin besar data semakin tidak efisien algoritma nya
//				 kumpulan data kecil = lumayan oke
//				 kumpulan data besar = BURUK (jangan dipakai)
