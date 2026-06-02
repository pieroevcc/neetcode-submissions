class DynamicArray {
    private int[] list;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.list = new int[capacity];
    }

    public int get(int i) {
        return list[i];
    }

    public void set(int i, int n) {
        list[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        list[size++] = n;
    }

    public int popback() {
        return list[--size];
    }

    private void resize() {
        capacity = capacity *2;
        int[] newlist = new int[capacity];
        for(int i = 0; i < getSize(); i++){
            newlist[i] = list[i];
        }
        list = newlist;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
