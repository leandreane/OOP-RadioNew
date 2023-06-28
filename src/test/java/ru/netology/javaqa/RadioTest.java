package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void nextFromZero() {
        Radio radio = new Radio();

        int expected = 1;
        radio.next();
        Assertions.assertEquals(expected, radio.getChanel());
    }

    @Test
    void nextFromMiddleValue() {
        Radio radio = new Radio();

        int expected = 6;
        radio.setChanel(5);
        radio.next();

        Assertions.assertEquals(expected, radio.getChanel());

    }

    @Test
    void nextFromMaxValue() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setChanel(9);
        radio.next();

        Assertions.assertEquals(expected, radio.getChanel());
    }

    @Test
    void prevFromZero() {
        Radio radio = new Radio();

        int expected = 9;
        radio.prev();

        Assertions.assertEquals(expected, radio.getChanel());

    }

    @Test
    void prevFromMiddleValue() {
        Radio radio = new Radio();

        int expected = 4;
        radio.setChanel(5);
        radio.prev();

        Assertions.assertEquals(expected, radio.getChanel());

    }

    @Test
    void prevFromMaxValue() {
        Radio radio = new Radio();

        int expected = 8;
        radio.setChanel(9);
        radio.prev();

        Assertions.assertEquals(expected, radio.getChanel());
    }

    @Test
    void setChanelNegative() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setChanel(-1);
        Assertions.assertEquals(expected, radio.getChanel());

    }

    @Test
    void setChanelNeutrale() {
        Radio radio = new Radio();

        int expected = 5;
        radio.setChanel(5);
        Assertions.assertEquals(expected, radio.getChanel());

    }

    @Test
    void increaseVolumeFromZero() {
        Radio radio = new Radio();

        int expected = 1;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxValue() {
        Radio radio = new Radio();

        int expected = 100;
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void decreaseVolumeValue() {
        Radio radio = new Radio();

        int expected = 0;
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());

        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void decreaseVolumeZeroValue() {
        Radio radio = new Radio();

        int expected = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setChanelMoreThanMax() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setChanel(11);
        Assertions.assertEquals(expected, radio.getChanel());
    }

}
