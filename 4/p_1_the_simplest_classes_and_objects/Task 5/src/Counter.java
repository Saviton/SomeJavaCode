class Counter {

    private int max;
    private int min;
    private int current;

    public Counter() {
        max = 30;
        min = 5;
        current = 6;
    }

    public Counter(int max, int min, int start) throws Exception {
        if (max < min)
            throw new Exception("range set incorrectly");
        if (start > max || (start < min))
            throw new Exception("range set incorrectly");
        this.max = max;
        this.min = min;
        current = start;
    }

    public void getNext() throws Exception {
        current++;
        if (current > max)
            throw new Exception("you went beyond");

    }

    public void getPrior() throws Exception {
        current--;
        if (current < min)
            throw new Exception("you went beyond");

    }

    public int getCurrentValue() {
        return current;
    }

    public int setCurrentValue(int value) throws Exception {
        if (value > max || (value < min))
            throw new Exception("specify the correct range");
        current = value;
        return value;
    }


    public int getMax() {
        return max;
    }

    public int setMax(int value) {
        max = value;
        return value;
    }


    public int getMin() {
        return min;
    }

    public int setMin(int value) {
        min = value;
        return value;
    }

    public void print() throws Exception {
        System.out.println("Min - " + this.getMin() + ", Max - " + this.getMax() + ", Current - " + this.getCurrentValue());
        this.getNext();
        System.out.print("Next - " + this.getCurrentValue());
        this.getPrior();
        System.out.println(", Prior - " + this.getCurrentValue());
    }
}
