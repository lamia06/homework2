package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.ConnexionDB;

public class Article {

	int  stock;
	double prix;
	String designation, photo, categorie,auteur,code;

	public Article() {
	}

/*	public static List<Article> getAll() {
		ConnectionDb conDB = new ConnectionDb();
		try {
			String query = "SELECT CodeArticle, Designation, Prix, Stock, Cat, Photo FROM articles JOIN categories ON articles.Categorie=categories.RefCat";
			PreparedStatement ps = conDB.getConnexion().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			List<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setCode(rs.getInt("CodeArticle"));
				article.setDesignation(rs.getString("Designation"));
				article.setPrix(rs.getInt("Prix"));
				article.setStock(rs.getInt("Stock"));
				article.setCategorie(rs.getString("Cat"));
				article.setPhoto(rs.getString("Photo"));
				articles.add(article);
			}
			return articles;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			conDB.close();
		}
	}
	public static Article getArticle(String code) {
		ConnectionDb conDB = new ConnectionDb();
		try {
			String query = "SELECT CodeArticle, Designation, Prix, Stock, Cat, Photo FROM articles JOIN categories ON articles.Categorie=categories.RefCat where CodeArticle = ?";
			PreparedStatement ps = conDB.getConnexion().prepareStatement(query);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Article article = new Article();
			article.setCode(rs.getInt("CodeArticle"));
			article.setDesignation(rs.getString("Designation"));
			article.setPrix(rs.getInt("Prix"));
			article.setStock(rs.getInt("Stock"));
			article.setCategorie(rs.getString("Cat"));
			article.setPhoto(rs.getString("Photo"));
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			conDB.close();
		}
	}*/
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", prix=" + prix + ", stock=" + stock + ", designation=" + designation
				+ ", photo=" + photo + ", categorie=" + categorie +  ", auteur=" + auteur + "]";
	}

	public void setAuteur(String auteur) {
		// TODO Auto-generated method stub
		this.auteur = auteur;
		
	}
	public String getAuteur() {
		return auteur;
	}

}