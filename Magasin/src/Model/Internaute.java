package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="clients")

public class Internaute {
	@Id
	@Column(name="Id")
	@GeneratedValue( strategy=GenerationType.AUTO)
private int Id;
private String Email;
private String Nom;
private String Prenom;
private String Adresse;
private String CodePostal;
private String Ville;

private String MotPasse;
public Internaute(int id, String email, String nom, String prenom, String adresse, String codePostal, String ville,
		 String motPasse) {
	super();
	Id = id;
	Email = email;
	Nom = nom;
	Prenom = prenom;
	Adresse = adresse;
	CodePostal = codePostal;
	Ville = ville;
	
	MotPasse = motPasse;
}
public Internaute() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getCodePostal() {
	return CodePostal;
}
public void setCodePostal(String codePostal) {
	CodePostal = codePostal;
}
public String getVille() {
	return Ville;
}
public void setVille(String ville) {
	Ville = ville;
}

public String getMotPasse() {
	return MotPasse;
}
public void setMotPasse(String motPasse) {
	MotPasse = motPasse;
}

}