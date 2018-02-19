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
 * Servlet implementation class ModificaDipendente
 */
@WebServlet("/ModificaDipendente")
public class ModificaDipendente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaDipendente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Crud c = new Crud();
		int id=Integer.parseInt(request.getParameter("id"));
		request.setAttribute("idD",id);
		request.setAttribute("ruoli",c.visualizzaRuolo());
		request.setAttribute("titoli",c.visualizzaTitolo());
		RequestDispatcher view;
		view=request.getRequestDispatcher("modificaDipendente.jsp");
		view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		Crud c = new Crud();
		Dipendente d = new Dipendente();
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		
		d.setNome(request.getParameter("nome"));
		d.setCognome(request.getParameter("cognome"));
		d.setEta(Integer.parseInt(request.getParameter("eta")));
		d.setIdRuolo(Integer.parseInt(request.getParameter("ruolo")));
		d.setIdTitolo(Integer.parseInt(request.getParameter("titolo")));
		
		
		c.modificaDipendente(id,d);
		
	
		request.setAttribute("dipendenti",c.visualizzaDipendente());
		RequestDispatcher view;
		view=request.getRequestDispatcher("visualizzaDipendente.jsp");
		view.forward(request,response);
		
	}

	}


