class DynamicArray {
    private int cap;
    private int size;
    private int[] vals;

    public DynamicArray(int capacity) {
        this.vals = new int[capacity];
        this.size = 0;
        this.cap = capacity;

        Arrays.fill(vals, -1);
    }

    public int get(int i) {
        int v = vals[i];
        return v;
    }

    public void set(int i, int n) {
        vals[i] = n;
    }

    public void pushback(int n) {
        if (size == cap) {
            resize();
        }

        vals[size] = n;
        size++;
        System.out.println(Arrays.toString(vals));
    }

    public int popback() {
        
        size--;
        int oldVal = vals[size];
        return oldVal;
    }

    private void resize() {
        cap = cap * 2;
        int[] newVals = new int[cap];
        Arrays.fill(newVals, -1);
        for (int i = 0; i < size; i++) {
            newVals[i] = vals[i];
        }
        vals = newVals;
    }

    public int getSize() {
        
        return size;
    }

    public int getCapacity() {
        return cap;
    }
}
