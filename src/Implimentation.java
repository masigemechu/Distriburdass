
import java.io.File;
import java.rmi.*;
import java.rmi.server.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Implimentation extends
        UnicastRemoteObject implements Interface {

    Implimentation() throws RemoteException {
        super();
    }

    @Override
    public void playAudio(String audioName) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("ggggg.mp4").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
        
        
    }
   
}
