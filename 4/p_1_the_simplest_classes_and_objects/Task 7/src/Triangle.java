class Triangle {
    private int a;
    private int b;
    private int c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double area() {
        return Math.sqrt(((this.perimeter() / 2) * ((this.perimeter() / 2) - this.a) * ((this.perimeter() / 2) - this.b) * (this.perimeter() / 2 - this.c)));
    }


    public boolean check() {
        if (a + c < b || b + c < a || a + b < c) {
            System.out.println("Error");
            return false;
        } else
            return true;
    }

}
