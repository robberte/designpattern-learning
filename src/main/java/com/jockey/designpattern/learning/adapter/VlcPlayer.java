package com.jockey.designpattern.learning.adapter;

/**
 * @author robberte
 * @date 2018/8/8 下午11:10
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vcl file. Name=" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // nothing to do
    }
}
