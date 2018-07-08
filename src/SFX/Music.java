/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFX;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author ricky
 */
public class Music {
    static AudioStream audio;
    public static void MainTheme(){
        InputStream music;
        
        try{
            music = new FileInputStream(new File("src\\SFX\\Test.wav"));
            AudioData data = new AudioStream(music).getData();
            ContinuousAudioDataStream loop = new ContinuousAudioDataStream(data);
            AudioPlayer.player.start(loop);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"fail biatch!!!");
        }
                
    }
    
    public static void BattleTheme(){
        InputStream music;
        AudioPlayer.player.stop();
        try{
            music = new FileInputStream(new File("src\\SFX\\BattleTest.wav"));
            audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"fail");
        }    
    }
    
    public static void ShopTheme(){
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\SFX\\shop.wav"));
            audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"fail");
        }
    }
    
    public static void GameOverTheme(){
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\SFX\\GameOver.wav"));
            audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"fail");
        }
    }

    public static AudioStream getAudio() {
        return audio;
    }

    public static void setAudio(AudioStream audio) {
        Music.audio = audio;
    }
    
}
