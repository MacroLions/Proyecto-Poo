/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFX;

import java.io.FileInputStream;
import java.io.IOException;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author ricky
 */
public class Music {
    public static void MainTheme(){
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            BGM = new AudioStream(new FileInputStream("src\\SFX\\IbMain.m4a"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }
        catch(IOException e)
        {
            System.out.println("No se encontro el archivo");
        }

        MGP.start(loop);
    }
    
    public static void BattleTheme(){
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            BGM = new AudioStream(new FileInputStream("src\\SFX\\VarienLilith.m4a"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }
        catch(IOException e)
        {
            System.out.println("No se encontro el archivo");
        }

        MGP.start(loop);
    }
    
}
