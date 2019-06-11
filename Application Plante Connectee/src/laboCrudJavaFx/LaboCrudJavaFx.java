/**
 * 
 */
package laboCrudJavaFx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import laboCrudJavaFx.model.DataCapteur;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;
import laboCrudJavaFx.repository.Repository;
import laboCrudJavaFx.repository.bdd.PlanteRepository;
import laboCrudJavaFx.repository.bdd.PlanteUseRepository;
import laboCrudJavaFx.repository.bdd.DataCapteurRepository;


/**
 * @author sebbo
 *
 */
public class LaboCrudJavaFx extends Application {

	public static LaboCrudJavaFx instance;

	private Stage primaryStage;

	public Repository<Plante> PlanteRepository = new PlanteRepository();
	
	public Repository<DataCapteur> DataCapteurRepository = new DataCapteurRepository();

	public Repository<PlanteUse> PlanteUseRepository = new PlanteUseRepository();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		instance = this;
		this.primaryStage = primaryStage;

		changePage("view/home/HomeView.fxml");

		primaryStage.setTitle("LaboCrudJavaFx");
		primaryStage.show();
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

	public void changePage(String page) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(page));
			primaryStage.setScene(new Scene(root, 800, 600));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
