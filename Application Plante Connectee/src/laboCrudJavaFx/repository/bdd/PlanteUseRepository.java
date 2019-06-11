/**
 * 
 */
package laboCrudJavaFx.repository.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;
import laboCrudJavaFx.repository.Repository;

/**
 * @author sebbo
 *
 */
public class PlanteUseRepository implements Repository<PlanteUse> {

	private List<PlanteUse> plantesuse = new ArrayList<>();

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;

	public PlanteUseRepository() {
		
		try {
			// db parameters
			String url = "jdbc:mariadb://192.168.43.36:3306/projet_plante_co";
			// create a connection to the database
			conn = DriverManager.getConnection(url,"pi","root");

			System.out.println("Connection to MariaDB has been established.");

		} catch (SQLException e) {
			System.out.println("error1");
			System.out.println(e.getMessage());
			System.out.println("error2");
		}
	}

	@Override
	public void addOrUpdate(PlanteUse item) {
		// TODO Auto-generated method stub
		try {
			st = conn.createStatement();
			String nom = item.getName();
			String categorie = item.getCategorie();
			String description = item.getDescription();
			float humidopti = item.getHumidopti();
			float tempopti = item.getTempopti();
			float lumopti = item.getLumopti();
			String periodeflo = item.getPeriodeflo();
//			System.out.println(nom);
//			System.out.println(categorie);
//			System.out.println(description);
//			System.out.println(humidopti);
//			System.out.println(tempopti);
//			System.out.println(lumopti);
//			System.out.println(periodeflo);


			
			String add = "INSERT INTO plant_use(plant_use_nom, plant_use_categorie, plant_use_description, plant_use_optimal_humidity, plant_use_optimal_temp, plant_use_optimal_lum, plant_use_peridoe_floraison)" 
			+ "VALUES ( ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = conn.prepareStatement(add);
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, categorie);
			preparedStatement.setString(3, description);
			preparedStatement.setFloat(4, humidopti);
			preparedStatement.setFloat(5, tempopti);
			preparedStatement.setFloat(6, lumopti);
			preparedStatement.setString(7, periodeflo);
			
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}

	@Override
	public List<PlanteUse> getAll() {
		// TODO Auto-generated method stub
				plantesuse.clear();
				try {
					st = conn.createStatement();		
					String getAll = "SELECT * FROM plant_use";
					rs = st.executeQuery(getAll);
					while (rs.next()) {
						System.out.println(rs.getString("plant_use_id"));
						plantesuse.add(new PlanteUse(rs.getInt("plant_use_id"), rs.getString("plant_use_nom"), rs.getString("plant_use_categorie"), rs.getString("plant_use_description"), Float.parseFloat(rs.getString("plant_use_optimal_humidity")), Float.parseFloat(rs.getString("plant_use_optimal_temp")), Float.parseFloat(rs.getString("plant_use_optimal_lum")), rs.getString("plant_use_peridoe_floraison")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
				return plantesuse;
	}

	@Override
	public PlanteUse get(int id) {
		// TODO Auto-generated method stub
		PlanteUse maPlanteSelect = new PlanteUse();
		try {
			st = conn.createStatement();		
			String getAll = "SELECT * FROM plant_use WHERE plant_use_id =" + id;
			rs = st.executeQuery(getAll);
			while (rs.next()) {	
				
//			System.out.println(rs.getInt("plant_use_id"));
//			System.out.println(rs.getString("plant_use_nom"));
//			System.out.println(rs.getString("plant_use_categorie"));
//			System.out.println(rs.getString("plant_use_description"));
//			System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_humidity")));
//			System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_temp")));
//			System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_lum")));
//			System.out.println(rs.getString("plant_use_peridoe_floraison"));

			maPlanteSelect.setId(rs.getInt("plant_use_id"));
			maPlanteSelect.setName(rs.getString("plant_use_nom"));
			maPlanteSelect.setCategorie(rs.getString("plant_use_categorie"));
			maPlanteSelect.setDescription(rs.getString("plant_use_description"));
			maPlanteSelect.setHumidopti(Float.parseFloat(rs.getString("plant_use_optimal_humidity")));
			maPlanteSelect.setTempopti(Float.parseFloat(rs.getString("plant_use_optimal_temp")));
			maPlanteSelect.setLumopti(Float.parseFloat(rs.getString("plant_use_optimal_lum")));
			maPlanteSelect.setPeriodeflo(rs.getString("plant_use_peridoe_floraison"));
			}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
//			conn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
		return maPlanteSelect;
}

	@Override
	public void remove(PlanteUse item) {
		// TODO Auto-generated method stub
		try {
			st = conn.createStatement();
			int id = item.getId();
			
			String delete = "DELETE FROM plant_use WHERE plant_use_id = " + id;
			PreparedStatement preparedStatement = conn.prepareStatement(delete);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
	}

	@Override
	public PlanteUse getLastData() {
		// TODO Auto-generated method stub
		return null;
	}

}
