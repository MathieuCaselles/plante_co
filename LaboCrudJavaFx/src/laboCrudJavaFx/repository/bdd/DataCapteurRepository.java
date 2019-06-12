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

import laboCrudJavaFx.model.DataCapteur;
import laboCrudJavaFx.model.Plante;
import laboCrudJavaFx.model.PlanteUse;
import laboCrudJavaFx.repository.Repository;

/**
 * @author Hugo
 *
 */
public class DataCapteurRepository implements Repository<DataCapteur> {
		
		private List<DataCapteur> donnees = new ArrayList<>();

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		public DataCapteurRepository() {
			
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
		public void addOrUpdate(DataCapteur item) {
		}

		@Override
		public List<DataCapteur> getAll() {
			// TODO Auto-generated method stub
			donnees.clear();
			try {
				st = conn.createStatement();		
				String getAll = "SELECT * FROM data_capter";
				rs = st.executeQuery(getAll);
				while (rs.next()) {
					System.out.println(rs.getString("data_capter_id"));
					donnees.add(new DataCapteur(rs.getInt("data_capter_id"), rs.getString("data_capter_date"), Float.parseFloat(rs.getString("data_capter_luminosity")), Float.parseFloat(rs.getString("data_capter_temp")), Float.parseFloat(rs.getString("data_capter_humidity"))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				conn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
			return donnees;
		}

		@Override
		public DataCapteur get(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove(DataCapteur item) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public DataCapteur getLastData() {
			// TODO Auto-generated method stub
			DataCapteur DonneeSelect = new DataCapteur();
			try {
				st = conn.createStatement();		
				String getAll = "SELECT * FROM data_capter ORDER BY data_capter_id DESC LIMIT 0,1";
				rs = st.executeQuery(getAll);
				while (rs.next()) {	
					
//				System.out.println(rs.getInt("plant_use_id"));
//				System.out.println(rs.getString("plant_use_nom"));
//				System.out.println(rs.getString("plant_use_categorie"));
//				System.out.println(rs.getString("plant_use_description"));
//				System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_humidity")));
//				System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_temp")));
//				System.out.println(Float.parseFloat(rs.getString("plant_use_optimal_lum")));
//				System.out.println(rs.getString("plant_use_peridoe_floraison"));

					DonneeSelect.setId(rs.getInt("data_capter_id"));
					DonneeSelect.setDate(rs.getString("data_capter_date"));
					DonneeSelect.setHumidactu(Float.parseFloat(rs.getString("data_capter_humidity")));
					DonneeSelect.setTempactu(Float.parseFloat(rs.getString("data_capter_temp")));
					DonneeSelect.setLumactu(Float.parseFloat(rs.getString("data_capter_luminosity")));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				conn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
			return DonneeSelect;
		}
	}




