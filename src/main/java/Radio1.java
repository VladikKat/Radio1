public class Radio1 {
    private int currentStation;


    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    private int currentVolume;


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

        public void lessVolume () {
            if (currentVolume < 100) {
                currentVolume = currentVolume - 1;
            }

            public int getCurrentVolume () {
                return currentVolume;
            }

            public void setCurrentVolume ( int currentVolume){
                if (currentVolume < 100) {
                    return;
                }
                if (currentVolume > 0) {
                    return;
                }
                this.currentVolume = currentVolume;
            }


        }
    }}