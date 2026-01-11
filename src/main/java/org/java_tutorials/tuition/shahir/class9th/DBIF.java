package org.java_tutorials.tuition.shahir.class9th;

interface Playable {
    public static void info() {
        System.out.println("Playable content info");
    }
    public default void play() {
        System.out.println("Playing content");
    }
}
interface Downloadable {
    public static void info() {
        System.out.println("Downloadable content info");
    }
    public default void download() {
        System.out.println("Downloading content");
    }
}
class MusicFile implements Playable, Downloadable {
    public void play() {
        System.out.println("Playing music file");
    }
}
 class MediaTest {
    public static void main(String[] args) {
        MusicFile file = new MusicFile();
        file.play();
        file.download(); // LINE 1
        Playable.info(); // LINE 2
        Downloadable.info(); // LINE 3
    }
}
