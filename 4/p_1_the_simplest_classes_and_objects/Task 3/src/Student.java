class Student {
    private String name;
    private String group;
    private int[] performance;

    public Student(String name, String group, int[] performance) {
        this.name = name;
        this.group = group;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void check_excellent() {
        for (int i = 0; i < performance.length; i++) {
            if (performance[i] != 9 && performance[i] != 10)
                break;
            if (i == performance.length - 1)
                System.out.println(this.name + " | " + this.group);
        }
    }
}
