class PyramidSorting {

    protected int[] arr;

    public PyramidSorting(int[] arr) {
        this.arr = arr;
    }

    private int add2Pyramid(int i, int N) {
        int max;
        int buf;
        if ((2 * i + 2) < N) {
            if (arr[2 * i + 1] < arr[2 * i + 2])
                max = 2 * i + 2;
            else
                max = 2 * i + 1;
        } else
            max = 2 * i + 1;
        if (max >= N)
            return i;
        if (arr[i] < arr[max]) {
            buf = arr[i];
            arr[i] = arr[max];
            arr[max] = buf;
            if (max < N / 2)
                i = max;
        }
        return i;
    }

    public void sorting() {
        for (int i = arr.length / 2 - 1; i >= 0; --i) {
            int prev_i = i;
            i = add2Pyramid(i, arr.length);
            if (prev_i != i)
                ++i;
        }

        for (int k = arr.length - 1; k > 0; --k) {
            int buf = arr[0];
            arr[0] = arr[k];
            arr[k] = buf;
            int i = 0, prev_i = -1;
            while (i != prev_i) {
                prev_i = i;
                i = add2Pyramid(i, k);
            }
        }
    }

}