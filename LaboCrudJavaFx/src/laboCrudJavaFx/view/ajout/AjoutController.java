package laboCrudJavaFx.view.ajout;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import laboCrudJavaFx.LaboCrudJavaFx;
import laboCrudJavaFx.model.Plante;

public class AjoutController {

	@FXML
	private TextField ajoutnom;
	@FXML
	private TextField ajoutcategorie;
	@FXML
	private TextField ajoutdescription;
	@FXML
	private TextField ajouthumidopti;
	@FXML
	private TextField ajouttempopti;
	@FXML
	private TextField ajoutlumiopti;
	@FXML
	private TextField ajoutperiodeflo;
	
		
	public void Save() {
		LaboCrudJavaFx.instance.PlanteRepository.addOrUpdate(new Plante(ajoutnom.getText(), ajoutcategorie.getText(), ajoutdescription.getText(), Float.parseFloat(ajouthumidopti.getText()), Float.parseFloat(ajouttempopti.getText()), Float.parseFloat(ajoutlumiopti.getText()), ajoutperiodeflo.getText()));
//		System.out.println(ajoutcategorie.getText());
	}
	
	public void GoToList() {
		LaboCrudJavaFx.instance.changePage("view/list/ListView.fxml");
	}

	public void Back() {
		LaboCrudJavaFx.instance.changePage("view/home/HomeView.fxml");
	}
}