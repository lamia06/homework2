package Dao;
import java.util.List;
import Model.Internaute;


public interface InternauteDao {
	
	
	Internaute getInternaute(int id);
	List<Internaute> getInternaute();
	public Internaute verify(String mail, String mdp);
	void addInternaute(Internaute i);
}




