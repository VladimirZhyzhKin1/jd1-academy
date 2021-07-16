package testCompareTo;

import javax.swing.text.Keymap;
import java.io.Serializable;
import java.util.Objects;

public final class TestCompareTo implements Comparable, Serializable {//
    private final int keyPart1;
    private final int keyPart2;


    public TestCompareTo(int keyPart1, int keyPart2) {
        this.keyPart1 = keyPart1;
        this.keyPart2 = keyPart2;
    }

    public int getKeyPart1() {
        return keyPart1;
    }

    /*public void setKeyPart1(int keyPart1) { // делали final класс , наши ключи тоже стали final.
     //поэтому методы set мы не можем использовать
        this.keyPart1 = keyPart1;
    }*/

    public int getKeyPart2() {
        return keyPart2;
    }

   /* public void setKeyPart2(int keyPart2) {
        this.keyPart2 = keyPart2;
    }*/

    @Override
    public String toString() {
        return super.toString() + keyPart1 + " : " + keyPart2;
    }

    @Override //если я не задокуменчу equals , то будут выводиться 2 значение в данном Map, а так один,
    // потомучто hashkode будут одинаковые и будет значение перезаписываться
    public boolean equals(Object o) { // сравнивает содержимое ключей
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestCompareTo testCompareTo = (TestCompareTo) o;
        return keyPart1 == testCompareTo.keyPart1 &&
                keyPart2 == testCompareTo.keyPart2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyPart1, keyPart2);
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.keyPart2, ((TestCompareTo)o).keyPart2);// сортируем по значению, а не по ключу
    }
}

