class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public void setHours(int hours) {
        this.hours = hours;
        if (this.hours >= 24 || this.hours < 0)
            this.hours = 0;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        if (this.minutes >= 60 || this.minutes < 0)
            this.minutes = 0;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (this.seconds >= 60 || this.seconds < 0)
            this.seconds = 0;
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }


}
