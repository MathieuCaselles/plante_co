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

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.repository.Repository;

/**
 * @author sebbo
 *
 */
public class PlanteRepository implements Repository<Plante> {
	
	private List<Plante> plantes = new ArrayList<>();

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;

	public PlanteRepository() {
		
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
	public void addOrUpdate(Plante item) {
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
			
			String add = "INSERT INTO plant(plant_nom, plant_categorie, plant_description, plant_optimal_humidity, plant_optimal_temp, plant_optimal_lum, plant_periode_floraison)" 
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
	public List<Plante> getAll() {
		// TODO Auto-generated method stub
		plantes.clear();
		try {
			st = conn.createStatement();		
			String getAll = "SELECT * FROM plant";
			rs = st.executeQuery(getAll);
			while (rs.next()) {
				System.out.println(rs.getString("plant_id"));
				plantes.add(new Plante(rs.getInt("plant_id"), rs.getString("plant_nom"), rs.getString("plant_categorie"), rs.getString("plant_description"), Float.parseFloat(rs.getString("plant_optimal_humidity")), Float.parseFloat(rs.getString("plant_optimal_temp")), Float.parseFloat(rs.getString("plant_optimal_lum")), rs.getString("plant_periode_floraison")));
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
		return plantes;
	}

	@Override
	public Plante get(int id) {
		// TODO Auto-generated method stub
//		try {
//		st = conn.createStatement();
//		String getid = "SELECT * FROM plant WHERE plante.getID() == id";
//		rs = st.executeQuery(getid);
//		while (rs.next()) {
//			plantes.add(new Plante(rs.getInt("plant_id"), rs.getString("plant_nom"), rs.getString("plant_categorie"), rs.getString("plant_description"), Float.parseFloat(rs.getString("plant_optimal_humidity")), Float.parseFloat(rs.getString("plant_optimal_temp")), Float.parseFloat(rs.getString("plant_optimal_lum")), rs.getString("plant_periode_floraison")));
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} finally {
//		try {
////			conn.close();
//			st.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	
//	}
//		return (Plante) plantes;
		return null;
	}

	@Override
	public void remove(Plante item) {
		try {
			st = conn.createStatement();
			int id = item.getId();
			
			String delete = "DELETE FROM plant WHERE plant_id = " + id;
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
	public Plante getLastData() {
		// TODO Auto-generated method stub
		return null;
	}

}
