package Dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import Model.Internaute;

import Model.ConnexionDB;

public class InternauteDaoImpl implements InternauteDao{
	private Connection conn;
	@Override
	public void addInternaute(Internaute i) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		conn = ConnexionDB.getConn();
		String query ="INSERT INTO clients (Id,Email,Nom,Prenom,Adresse,CodePostal,Ville,MotPasse) VALUES (NULL,?,?,?,?,?,?,?);";

		
		try {
			PreparedStatement pr = conn.prepareStatement(query);
			pr.setString(1, i.getEmail());
			pr.setString(2, i.getNom());
			pr.setString(3, i.getPrenom());
			pr.setString(4, i.getAdresse());
			pr.setString(5, i.getCodePostal());
			pr.setString(6, i.getVille());
			
			pr.setString(7, i.getMotPasse());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}
		System.out.println("added");
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	}




	@Override
	public List<Internaute> getInternaute() {
		// TODO Auto-generated method stub
		return null;
	}
	public Internaute verify(String mail,String mdp) {
		PreparedStatement ps;
		ResultSet rs;
		String query1 ="SELECT * FROM clients WHERE Email='"+mail+"' AND MotPasse='"+mdp+"';";

		try {
			ps = ConnexionDB.getConn().prepareStatement(query1);
			rs = ps.executeQuery();

			if(rs.next()!=false) {
				Internaute c1 = new Internaute();

					c1.setNom(rs.getString("Nom"));
					c1.setPrenom(rs.getString("Prenom"));
					c1.setEmail(rs.getString("Email"));
					c1.setAdresse(rs.getString("Adresse"));
					c1.setCodePostal(rs.getString("CodePostal"));
					c1.setVille(rs.getString("Ville"));
				
					c1.setMotPasse(rs.getString("MotPasse"));
					return c1;
			}
			else return null;
			
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}

		return null;
		
	}

	@Override
	public Internaute getInternaute(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}