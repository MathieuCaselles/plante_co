package laboCrudJavaFx.view.home;

import laboCrudJavaFx.LaboCrudJavaFx;

public class HomeController {

	public void initialize() {
	}

	public void GoToList() {
		LaboCrudJavaFx.instance.changePage("view/list/ListView.fxml");
	}
	
	public void GoToAjout() {
		LaboCrudJavaFx.instance.changePage("view/ajout/AjoutView.fxml");
	}
	public void GoToplanteUse() {
		LaboCrudJavaFx.instance.changePage("view/listPlanteUse/ListPlanteUseView.fxml");
	}
}