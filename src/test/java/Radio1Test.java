import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class Radio1Test {

    @Test
    public void test() {
        Radio1 radio1 = new Radio1();

        radio1.setCurrentStation(8);

        radio1.next();

        int expected = 9;
        int actual = radio1.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio1 radio1 = new Radio1();

        radio1.setCurrentStation(6);

        radio1.prev();

        int expected = 5;
        int actual = radio1.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    Radio1 radio1 = new Radio1();

        radio1.setCurrrentVolume(8);

        radio1.increaseVolume();

    int expected = 9;
    int actual = radio1.getCurrentVolume();
        Assertions.assertEquals(expected,actual);


    @Test
    Radio1 radio1 = new Radio1();

        radio1.setCurrrentVolume(9);

        radio1.lessVolume();

    int expected = 8;
    int actual = radio1.getCurrentVolume();
        Assertions.assertEquals(expected,actual);


}