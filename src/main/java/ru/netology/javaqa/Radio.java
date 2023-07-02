package ru.netology.javaqa;

class Radio {
    private int chanel;
    private int maxChanel;
    private int currentVolume;

    public Radio() {
        this.maxChanel = 9;
    }

    public Radio(int countChanel) {
        if (countChanel < 1) {
            this.maxChanel = 0;
        } else {
            this.maxChanel = countChanel - 1;
        }
    }

    public void next() {
        if (chanel < maxChanel) {
            chanel++;
        } else {
            chanel = 0;
        }
    }

    public void prev() {
        if (chanel > 0) {
            chanel--;
        } else {
            chanel = maxChanel;
        }

    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        if (0 <= chanel && chanel <= maxChanel) {
            this.chanel = chanel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
