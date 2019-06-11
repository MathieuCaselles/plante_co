package laboCrudJavaFx.repository.offline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import laboCrudJavaFx.model.PlanteUse;
import laboCrudJavaFx.repository.Repository;

/**
 * @author sebbo
 *
 */

	
public class PlanteUseOfflineRepository implements Repository<PlanteUse> {

	private List<PlanteUse> plantesUse = new ArrayList<>();	
	
//	public PlanteUseOfflineRepository() {
//		addOrUpdate(new PlanteUse("Bob", "Blanc"));
//	}

	@Override
	public void addOrUpdate(PlanteUse item) {
		if (item.getId() > 0) {
			plantesUse.remove(item);
		} else {
			int id = 0;
			if (!plantesUse.isEmpty()) {
				id = plantesUse.stream().max(Comparator.comparingInt(PlanteUse::getId)).get().getId();
			}
			item.setId(id + 1);
		}
		plantesUse.add(item);
	}

	@Override
	public List<PlanteUse> getAll() {
		return plantesUse;
	}

	@Override
	public PlanteUse get(int id) {
		return plantesUse.stream().filter(poney -> poney.getId() == id).findFirst().get();
	}

	@Override
	public void remove(PlanteUse item) {
		plantesUse.remove(item);
	}

}
