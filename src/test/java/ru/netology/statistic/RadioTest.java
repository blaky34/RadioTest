package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetCurrentRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPressNextStation() {
        radio.setCurrentRadioStation(0);
        radio.pressNextStation();
        assertEquals(1, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(11);
        radio.pressNextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPressPrevStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        assertEquals(10, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        radio.pressPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetToMaxStation() {
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStation(-1);
        radio.setMaxStation(0);
        radio.setMaxStation(11);
        assertEquals(11, radio.getMaxStation());
    }

    @Test
    public void shouldGetToMinStation() {
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setMinStation(-1);
        radio.setMinStation(0);
        radio.setMinStation(11);
        assertEquals(11, radio.getMinStation());
    }

    //тестируем громкость
    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(100, radio.getCurrentVolume());

        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldGetMaxVolume() {
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setMaxVolume(100);
        radio.setMinVolume(1);
        assertEquals(1, radio.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setMinVolume(1);
        radio.setMaxVolume(101);
        assertEquals(101, radio.getMaxVolume());
    }

    @Test
    public void shouldPressVolumeUp() {
        radio.setCurrentVolume(4);
        radio.pressVolumeUp();
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.pressVolumeUp();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPressVolumeDown() {
        radio.setCurrentVolume(4);
        radio.pressVolumeDown();
        assertEquals(3, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        radio.pressVolumeDown();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCreateStationsWithLimits() {
        Radio radio = new Radio(1);
        assertEquals(0, radio.getMaxStation());

        Radio radio1 = new Radio(100);
        assertEquals(99, radio1.getMaxStation());

        Radio radio2 = new Radio(10);
        assertEquals(0, radio2.getMinStation());
    }
}