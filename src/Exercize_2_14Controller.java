import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class Exercize_2_14Controller {
	//------------------------------------------
	@FXML
	private Button Button_Start;

	@FXML
	private ImageView Picture_Loading;

	@FXML
	private Label LabelArea;
	//------------------------------------------
	//------------------------------------------
	@FXML
	void Button_Start_Pressed(ActionEvent event) {
		new Thread() {
			public void run() {
				//----------------------------------
				Picture_Loading.setVisible(true);
				Button_Start.setDisable(true);
				//---------------------------------- Imitation of loading
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				//----------------------------------
				Button_Start.setVisible(false);
				Picture_Loading.setVisible(false);
				LabelArea.setVisible(true);
			}

		}.start();
	}

}
