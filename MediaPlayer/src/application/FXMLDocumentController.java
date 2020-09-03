package application;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
public class FXMLDocumentController implements Initializable {
	@FXML
	private Label label;
    
	
	private MediaPlayer MediaPlayer;
	public String path;
	
	@FXML
	private MediaView MediaView;
	
	@FXML
	private void handleme(ActionEvent event)
	{
	FileChooser FileChooser=new FileChooser();
	FileChooser.ExtensionFilter filter= new FileChooser.ExtensionFilter("Mp4 file please", ".mp4");
	FileChooser.getExtensionFilters().add(filter);
	File file=FileChooser.showOpenDialog(null);
	path=file.toURI().toString();
	if(path != null)
	{
		Media media=new Media(path);
		MediaPlayer =new MediaPlayer(media);
		MediaView.setMediaPlayer(MediaPlayer);
		MediaPlayer.play();
		
		
	}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
