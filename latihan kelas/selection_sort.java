public static void sort(int array[]) {
        for (int y = 0; y < array.length; y++) {
            int min = y;
            for (int x = y; x < array.length; x++) {
                if (array[x] < array[min]) {min = x; }
            }
            int temp   = array[y];
            array[y]   = array[min];
            array[min] = temp;
        }
    }
