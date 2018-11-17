package com.jockey.designpattern.learning.adapter;

/**
 * @author robberte
 * @date 2018/8/8 下午11:22
 */
public class AdaterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "me.avi");
    }
}
