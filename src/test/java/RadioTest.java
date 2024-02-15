import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
1) Переключение радиостанций
- переключение на следующую станцию от 0-8
- переключение на следующую станцию при текущей равной 9
- переключение на предыдущую при текущей 1-9
- переключение на предыдущую при текущей 0

2) Установкаа радиостанции
- Установка валидного номера (от 0 до 9)
- Установка невалидного номера (меньше 0 или больше 9)

3) Регулировка громкости
- Увеличение уровня громкости при текущем от 0 до 99
- Увеличение уровня громкости при максимальном (100)
- Уменьшение уровня громкости при текущем от 1 до 100
- Уменьшение уровня громкости при минимальном (0)

* */
class RadioTest {

    @Test
    void shouldSwitchToNextStation(){
        Radio radio = new Radio();
        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    void shouldSwitchToPrevStation(){
        Radio radio = new Radio();
        radio.next();
        radio.next();
        radio.prev();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchTonextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToprevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToValidStation(){
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }
    @Test
    void shouldSwitchToInValidStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(60);
        radio.setCurrentStation(-60);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void shouldSwitchToIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchToLessVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.lessVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchToLessincorrectVolume(){
        Radio radio = new Radio();
        radio.lessVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchToincreseincorrectVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldSetStationToZero(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldSetStationToBelowZero(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationToAboneNine(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeToHundred(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeToBelowZero(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeToAboveHundred(){
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }


}