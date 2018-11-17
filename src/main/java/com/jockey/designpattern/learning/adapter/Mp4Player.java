package com.jockey.designpattern.learning.adapter;

/**
 * @author robberte
 * @date 2018/8/8 下午11:11
 */
public class Mp4Player implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name=" + fileName);
    }
}
