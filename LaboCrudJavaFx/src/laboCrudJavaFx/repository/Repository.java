/**
 * 
 */
package laboCrudJavaFx.repository;

import java.util.List;

/**
 * @author sebbo
 *
 */
public interface Repository<T> {

	public void addOrUpdate(T item);

	public List<T> getAll();

	public T get(int id);
	
	public T getLastData();

	public void remove(T item);

}
