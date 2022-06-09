package ru.netology.statistic;

public class Radio {
    private int currentRadioStation = 10;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int generateNewStation) {
        this.currentRadioStation = generateNewStation;
        maxStation = generateNewStation - 1;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            currentRadioStation = minStation;
        }
        if (currentRadioStation < minStation) {
            currentRadioStation = maxStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void pressNextStation() {
        if (currentRadioStation >= maxStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void pressVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }
}



