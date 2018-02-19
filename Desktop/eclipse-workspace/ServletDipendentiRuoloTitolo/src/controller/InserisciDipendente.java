package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dipendente;

/**
 * Servlet implementation class InserisciDipendente
 */
@WebServlet("/InserisciDipendente")
public class InserisciDipendente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserisciDipendente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Crud c = new Crud();
		request.setAttribute("ruoli",c.visualizzaRuolo());
		request.setAttribute("titoli",c.visualizzaTitolo());
		RequestDispatcher view;
		view=request.getRequestDispatcher("inserisciDipendente.jsp");
		view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Crud c = new Crud();
		Dipendente d = new Dipendente();
		d.setNome(request.getParameter("nome"));
		d.setCognome(request.getParameter("cognome"));
		System.out.println("Eta====================>"+(request.getParameter("eta")));
		d.setEta(Integer.parseInt(request.getParameter("eta")));
		d.setIdRuolo(Integer.parseInt(request.getParameter("ruolo")));
		d.setIdTitolo(Integer.parseInt(request.getParameter("titolo")));

		c.inserimentoDipendente(d);
		request.setAttribute("dipendenti",c.visualizzaDipendente());
		RequestDispatcher view;
		view=request.getRequestDispatcher("visualizzaDipendente.jsp");
		view.forward(request,response);
		
	}

}
