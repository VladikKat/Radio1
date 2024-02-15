package ru.netology;

public class Radio {

    private int currentStation;

    private int currentVolume;
    private int maxStation;

    public Radio(){
        this.maxStation = 9;
    }

    public Radio (int stationCount){
        this.maxStation = stationCount - 1;
    }



    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void lessVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= maxStation) {
            this.currentStation = currentStation;
        }

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}