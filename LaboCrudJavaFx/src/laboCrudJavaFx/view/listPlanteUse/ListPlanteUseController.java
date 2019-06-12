package laboCrudJavaFx.view.listPlanteUse;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import laboCrudJavaFx.LaboCrudJavaFx;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;

public class ListPlanteUseController {

	@FXML
	private TableView<PlanteUse> table;
	
//	@FXML
//	private Text nameplante;
	
	public static int idAffiche;

	public void initialize() {
		table.getColumns().clear();

		TableColumn<PlanteUse, Integer> columnId = new TableColumn<>("Id");
		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));

		TableColumn<PlanteUse, String> columnName = new TableColumn<>("Nom");
		columnName.setCellValueFactory(new PropertyValueFactory<>("name"));

		TableColumn<PlanteUse, String> columnCategorie = new TableColumn<>("Categorie");
		columnCategorie.setCellValueFactory(new PropertyValueFactory<>("categorie"));
		
		TableColumn<PlanteUse, String> columnDescription = new TableColumn<>("Description");
		columnDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
		
		TableColumn<PlanteUse, String> columnHumiditeOptimale = new TableColumn<>("Humidite Optimale");
		columnHumiditeOptimale.setCellValueFactory(new PropertyValueFactory<>("humidopti"));
		
		TableColumn<PlanteUse, String> columnTemperatureOptimale = new TableColumn<>("Temperature Optimale");
		columnTemperatureOptimale.setCellValueFactory(new PropertyValueFactory<>("tempopti"));
		
		TableColumn<PlanteUse, String> columnLuminositeOptimale = new TableColumn<>("Luminosite Optimale");
		columnLuminositeOptimale.setCellValueFactory(new PropertyValueFactory<>("lumopti"));
		
		TableColumn<PlanteUse, String> columnPeriodeFloraison = new TableColumn<>("Periode de Floraison");
		columnPeriodeFloraison.setCellValueFactory(new PropertyValueFactory<>("periodeflo"));

		table.getColumns().addAll(columnId, columnName, columnCategorie, columnDescription, columnHumiditeOptimale, columnTemperatureOptimale, columnLuminositeOptimale, columnPeriodeFloraison);

		table.setItems(FXCollections.observableArrayList(LaboCrudJavaFx.instance.PlanteUseRepository.getAll()));

	}
	
	public void affiche() {
		PlanteUse PlanteAffiche = table.getSelectionModel().getSelectedItem();
		idAffiche = PlanteAffiche.getId();
		//LaboCrudJavaFx.instance.PoneyUseRepository.addOrUpdate(new PoneyUse(poneyAffiche.getName(), poneyAffiche.getColor()));
		
		LaboCrudJavaFx.instance.changePage("view/planteSelect/planteSelectView.fxml");
	}
	
	public void delete() {
		PlanteUse delplante = table.getSelectionModel().getSelectedItem();
		LaboCrudJavaFx.instance.PlanteUseRepository.remove(delplante);
		LaboCrudJavaFx.instance.changePage("view/listPlanteUse/ListPlanteUseView.fxml");

	}

	public void back() {
		LaboCrudJavaFx.instance.changePage("view/home/HomeView.fxml");
	}
}