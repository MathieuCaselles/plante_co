package laboCrudJavaFx.view.historique;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import laboCrudJavaFx.LaboCrudJavaFx;
import laboCrudJavaFx.model.DataCapteur;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;

public class HistoriqueController {

	@FXML
	private TableView<DataCapteur> table;
	
//	@FXML
//	private Text nameplante;
	
	public static int idAffiche;

	public void initialize() {
		table.getColumns().clear();

		TableColumn<DataCapteur, Integer> columnId = new TableColumn<>("Id");
		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));

		TableColumn<DataCapteur, String> columnDate = new TableColumn<>("Date");
		columnDate.setCellValueFactory(new PropertyValueFactory<>("date"));

		TableColumn<DataCapteur, String> columnHumidite = new TableColumn<>("Humidite");
		columnHumidite.setCellValueFactory(new PropertyValueFactory<>("humidactu"));
		
		TableColumn<DataCapteur, String> columnLuminosite = new TableColumn<>("Luminosite");
		columnLuminosite.setCellValueFactory(new PropertyValueFactory<>("lumactu"));
		
		TableColumn<DataCapteur, String> columnTemperature = new TableColumn<>("Temperature");
		columnTemperature.setCellValueFactory(new PropertyValueFactory<>("tempactu"));

		table.getColumns().addAll(columnId, columnDate, columnHumidite, columnLuminosite, columnTemperature);

		table.setItems(FXCollections.observableArrayList(LaboCrudJavaFx.instance.DataCapteurRepository.getAll()));

	}
	
	public void Refresh() {
		LaboCrudJavaFx.instance.changePage("view/historique/HistoriqueView.fxml");
	}

	public void back() {
		LaboCrudJavaFx.instance.changePage("view/home/HomeView.fxml");
	}
}