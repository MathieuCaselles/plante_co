package laboCrudJavaFx.view.planteSelect;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import laboCrudJavaFx.LaboCrudJavaFx;
import laboCrudJavaFx.model.DataCapteur;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;
import laboCrudJavaFx.repository.offline.PlanteUseOfflineRepository;
import laboCrudJavaFx.view.listPlanteUse.ListPlanteUseController;

public class PlanteSelectController {

	@FXML
	private Text NomPlante;
	@FXML
	private Text PeriodefloPlante;
	@FXML
	private Text DescriptionPlante;
	@FXML
	private Text HumiditeOptiPlante;
	@FXML
	private Text TemperatureOptiPlante;
	@FXML
	private Text LuminositeOptiPlante;
	@FXML
	private Text CategoriePlante;
	@FXML
	private Text HumiditeActuPlante;
	@FXML
	private Text TemperatureActuPlante;
	@FXML
	private Text LuminositeActuPlante;
	
	private String NomPlanteSelect;
	private String PeriodefloPlanteSelect;
	private String DescriptionPlanteSelect;
	private Float HumiditeOptiPlanteSelect;
	private Float TemperatureOptiPlanteSelect;
	private Float LuminositeOptiPlanteSelect;
	private String CategoriePlanteSelect;
	private Float HumiditeActuPlanteSelect;
	private Float TemperatureActuPlanteSelect;
	private Float LuminositeActuPlanteSelect;

	
	
	public void initialize() {
		PlanteUse PlanteSelect = LaboCrudJavaFx.instance.PlanteUseRepository.get(ListPlanteUseController.idAffiche);
		
		NomPlanteSelect = PlanteSelect.getName();
		PeriodefloPlanteSelect = PlanteSelect.getPeriodeflo();
		DescriptionPlanteSelect = PlanteSelect.getDescription();
		HumiditeOptiPlanteSelect = PlanteSelect.getHumidopti();
		TemperatureOptiPlanteSelect = PlanteSelect.getTempopti();
		LuminositeOptiPlanteSelect = PlanteSelect.getLumopti();
		CategoriePlanteSelect = PlanteSelect.getCategorie();
		
		NomPlante.setText(NomPlanteSelect);
		PeriodefloPlante.setText(PeriodefloPlanteSelect);
		DescriptionPlante.setText(DescriptionPlanteSelect);
		HumiditeOptiPlante.setText(Float.toString(HumiditeOptiPlanteSelect));
		TemperatureOptiPlante.setText(Float.toString(TemperatureOptiPlanteSelect));
		LuminositeOptiPlante.setText(Float.toString(LuminositeOptiPlanteSelect));
		CategoriePlante.setText(CategoriePlanteSelect);
		
		DataCapteur DataSelect = LaboCrudJavaFx.instance.DataCapteurRepository.getLastData();
		HumiditeActuPlanteSelect = DataSelect.getHumidactu();
		TemperatureActuPlanteSelect = DataSelect.getTempactu();
		LuminositeActuPlanteSelect = DataSelect.getLumactu();
		
		HumiditeActuPlante.setText(Float.toString(HumiditeActuPlanteSelect));
		TemperatureActuPlante.setText(Float.toString(TemperatureActuPlanteSelect));
		LuminositeActuPlante.setText(Float.toString(LuminositeActuPlanteSelect));

	}
	
	public void Refresh() {
		LaboCrudJavaFx.instance.changePage("view/planteSelect/PlanteSelectView.fxml");
	}
	
	public void GoToHistorique() {
		LaboCrudJavaFx.instance.changePage("view/historique/HistoriqueView.fxml");
	}
	public void back() {
	LaboCrudJavaFx.instance.changePage("view/home/HomeView.fxml");
	}
}
	