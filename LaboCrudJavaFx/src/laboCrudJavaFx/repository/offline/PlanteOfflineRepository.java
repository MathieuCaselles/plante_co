package laboCrudJavaFx.repository.offline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.repository.Repository;

/**
 * @author sebbo
 *
 */

public class PlanteOfflineRepository implements Repository<Plante> {

	private List<Plante> plantes = new ArrayList<>();

	public PlanteOfflineRepository() {
		addOrUpdate(new Plante("Bob", "Blanc"));
		addOrUpdate(new Plante("George", "Noir"));
	}
	@Override
	public void addOrUpdate(Plante item) {
		if (item.getId() > 0) {
			plantes.remove(item);
		} else {
			int id = 0;
			if (!plantes.isEmpty()) {
				id = plantes.stream().max(Comparator.comparingInt(Plante::getId)).get().getId();
			}
			item.setId(id + 1);
		}
		plantes.add(item);
	}

	@Override
	public List<Plante> getAll() {
		return plantes;
	}

	@Override
	public Plante get(int id) {
		return plantes.stream().filter(poney -> poney.getId() == id).findFirst().get();
	}

	@Override
	public void remove(Plante item) {
		plantes.remove(item);
	}
}
