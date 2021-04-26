package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Model.Article;
import Model.ConnexionDB;

public class ArticleDaoImpl implements ArticleDao{

	@SuppressWarnings("null")
	@Override
	public List<Article> ArticleParType(String t) {
		List<Article> articles = null;
		PreparedStatement ps;
		ResultSet rs;
		String query1 ="SELECT * FROM article WHERE Type='"+t+"';";

		try {
			ps = ConnexionDB.getConn().prepareStatement(query1);
			rs = ps.executeQuery();
			while(rs.next()) {
				
			
				Article ar = new Article();

					ar.setCode(rs.getString("Reference"));
					ar.setAuteur(rs.getString("Auteur"));
					ar.setStock(Integer.parseInt(rs.getString("Quantité")));
					ar.setDesignation(rs.getString("Titre"));
					ar.setCategorie(rs.getString("Type"));
					ar.setPhoto(rs.getString("Photo"));
					ar.setPrix(Double.parseDouble(rs.getString("Prix")));
					articles.add(ar);
			}
			return articles;
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}

		return null;
		
	}


}
