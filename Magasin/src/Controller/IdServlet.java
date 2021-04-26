package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;

//import com.DAO.ClientDAO;
//import com.DAO.ClientDAOImlp;


import Model.Internaute;

//import business.clients;

/**
 * Servlet implementation class IdServlet
 */
@WebServlet("/IdServlet")

public class IdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//request.setAttribute("Client", new ClientModel());
		//request.getRequestDispatcher("accueil.jsp").forward(request, response);
		//request.setAttribute("Erreur", new Boolean());
		//request.getRequestDispatcher("identifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute("emf");
		EntityManager em = emf.createEntityManager();
		try {
		//Return Client
		String email=request.getParameter("email");
		String mdp=request.getParameter("mdp");
		//ClientModel cd= new ClientDAOImlp().verify(email, mdp);
		
		String query1 ="SELECT e "+"FROM Internaute e "+" WHERE e.Email='"+email+"' AND e.MotPasse='"+mdp+"'";

		List<Internaute> clients =em.createQuery(query1,Internaute.class).getResultList();
		if(clients!=null) {
			request.setAttribute("Client", clients);
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}else {
			
			System.out.println("error");
			request.setAttribute("Erreur", "Email ou Mot de Passe est incorrect Veuiller ressayer svp !!!");
			request.getRequestDispatcher("identifier.jsp").forward(request, response);
		}
		}finally {
			
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			em.close();
		}
        
        
		
	}

}