class Test1 {
    int a;
    int b;

    public void print() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public void editparamA(int a) {
        this.a = a;
    }

    public void editparamB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        return a >= b ? a : b;
    }
}
