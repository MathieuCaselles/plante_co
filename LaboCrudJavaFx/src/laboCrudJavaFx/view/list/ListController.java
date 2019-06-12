package laboCrudJavaFx.view.list;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import laboCrudJavaFx.LaboCrudJavaFx;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;

public class ListController {

	@FXML
	private TableView<Plante> table;


	public void initialize() {
		table.getColumns().clear();

		TableColumn<Plante, Integer> columnId = new TableColumn<>("Id");
		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));

		TableColumn<Plante, String> columnName = new TableColumn<>("Nom");
		columnName.setCellValueFactory(new PropertyValueFactory<>("name"));

		TableColumn<Plante, String> columnCategorie = new TableColumn<>("Categorie");
		columnCategorie.setCellValueFactory(new PropertyValueFactory<>("categorie"));
		
		TableColumn<Plante, String> columnDescription = new TableColumn<>("Description");
		columnDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
		
		TableColumn<Plante, String> columnHumiditeOptimale = new TableColumn<>("Humidite Optimale");
		columnHumiditeOptimale.setCellValueFactory(new PropertyValueFactory<>("humidopti"));
		
		TableColumn<Plante, String> columnTemperatureOptimale = new TableColumn<>("Temperature Optimale");
		columnTemperatureOptimale.setCellValueFactory(new PropertyValueFactory<>("tempopti"));
		
		TableColumn<Plante, String> columnLuminositeOptimale = new TableColumn<>("Luminosite Optimale");
		columnLuminositeOptimale.setCellValueFactory(new PropertyValueFactory<>("lumopti"));
		
		TableColumn<Plante, String> columnPeriodeFloraison = new TableColumn<>("Periode de Floraison");
		columnPeriodeFloraison.setCellValueFactory(new PropertyValueFactory<>("periodeflo"));

		table.getColumns().addAll(columnId, columnName, columnCategorie, columnDescription, columnHumiditeOptimale, columnTemperatureOptimale, columnLuminositeOptimale, columnPeriodeFloraison);

		table.setItems(FXCollections.observableArrayList(LaboCrudJavaFx.instance.PlanteRepository.getAll()));

	}
	
	public void AddToPlanteUse() {
		Plante newplanteUse = table.getSelectionModel().getSelectedItem();
		LaboCrudJavaFx.instance.PlanteUseRepository.addOrUpdate(new PlanteUse(newplanteUse.getName(), newplanteUse.getCategorie(), newplanteUse.getDescription(), newplanteUse.getHumidopti(), newplanteUse.getTempopti(), newplanteUse.getLumopti(), newplanteUse.getPeriodeflo()));
//		System.out.println(newplanteUse.getCategorie());
//		System.out.println(newplanteUse.getDescription());
//		System.out.println(newplanteUse.getHumidopti());
//		System.out.println(newplanteUse.getTempopti());
//		System.out.println(newplanteUse.getLumopti());
//		System.out.println(newplanteUse.getPeriodeflo());
	}
	
	public void delete() {
		Plante delplante = table.getSelectionModel().getSelectedItem();
		LaboCrudJavaFx.instance.PlanteRepository.remove(delplante);
		LaboCrudJavaFx.instance.changePage("view/list/ListView.fxml");

	}
	
	public void GoToAjout() {
		LaboCrudJavaFx.instance.changePage("view/ajout/AjoutView.fxml");
	}

	public void back() {
		LaboCrudJavaFx.instance.changePage("view/home/HomeView.fxml");
	}
}