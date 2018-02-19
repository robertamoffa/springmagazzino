package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Dipendente;
import model.Ruolo;
import model.Titolo;

public class Crud {
	
	
static Connection conn; 
	

	public static Connection getConn() {
		return conn;                       }

  
	static {       
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdrt","root","");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("l 'errore è qua");
		}
	}

	  public void chiudiConnessione()throws SQLException{
			conn.close();     

		}

	
	  public void inserimentoDipendente(Dipendente d) {
		  String sql="INSERT INTO dipendenti(id,nome,cognome,eta,id_ruolo,id_titolo) VALUES(?,?,?,?,?,?)";
		  PreparedStatement ps;
		  try {
		  ps=conn.prepareStatement(sql);
		  ps.setInt(1, d.getId());
		  ps.setString(2,d.getNome());
		  ps.setString(3,d.getCognome());
		  ps.setInt(4,d.getEta());
		  ps.setInt(5,d.getIdRuolo());
		  ps.setInt(6,d.getIdTitolo());
		  ps.executeUpdate();
		  }
		  catch(SQLException e) {
			  System.out.println("La query non è ben strutturta!");}
		  }
	  
	  
	  
	  
		public ArrayList<Dipendente> visualizzaDipendente(){
			ArrayList<Dipendente>dip=new ArrayList<Dipendente>();
			String sql="SELECT * FROM dipendenti";
			PreparedStatement ps;
			ResultSet rs;
			try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
			Dipendente d = new Dipendente();
			d.setId(rs.getInt("id"));
		    d.setNome(rs.getString("nome"));
		    d.setCognome(rs.getString("cognome"));
		    d.setEta(rs.getInt("eta"));
		    d.setIdRuolo(rs.getInt("id_ruolo"));
		    d.setIdTitolo(rs.getInt("id_titolo"));
			dip.add(d);}
			}
			catch(SQLException e){
			System.out.println("la query non è ben strutturata!");
			}
			return dip;
			}
	  
	
	  
	  public void modificaDipendente(int id,Dipendente d) {
		  String sql="UPDATE dipendenti SET nome=?,cognome=?,eta=?,id_ruolo=?,id_titolo=? WHERE id=?";
		  PreparedStatement ps;
		  try {
		  ps=conn.prepareStatement(sql);
		  ps.setString(1,d.getNome());
		  ps.setString(2,d.getCognome());
		  ps.setInt(3,d.getEta());
		  ps.setInt(4,d.getIdRuolo());
		  ps.setInt(5,d.getIdTitolo());
		  ps.setInt(6,id);
		  ps.executeUpdate();
		  }
		  catch(SQLException e) {
			  System.out.println("La query non è ben strutturta!");}
		  }
	  
	  
	  public void cancellaDipendente(int id) {
		  String sql="DELETE FROM dipendenti WHERE id=?";
		  PreparedStatement ps;
		  try {
		  ps=conn.prepareStatement(sql);
		  ps.setInt(1,id);
		  ps.executeUpdate();
		  }
		  catch(SQLException e) {
			  System.out.println("La query non è ben strutturta!");}
		  }
	  
	  
	  
		
		public ArrayList<Ruolo> visualizzaRuolo(){
			ArrayList<Ruolo>ruol=new ArrayList<Ruolo>();
			String sql="SELECT * FROM ruoli";
			PreparedStatement ps;
			ResultSet rs;
			try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
			Ruolo r = new Ruolo();
			r.setId(rs.getInt("id"));
			r.setDescrizione(rs.getString("descrizione"));
			ruol.add(r);}
			}
			catch(SQLException e){
			System.out.println("la query non è ben strutturata!");
			}
			return ruol;
			}
		
		
		
		public ArrayList<Titolo> visualizzaTitolo(){
			ArrayList<Titolo> tit=new ArrayList<Titolo>();
			String sql="SELECT * FROM titoli";
			PreparedStatement ps;
			ResultSet rs;
			try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
			Titolo t = new Titolo();
			t.setId(rs.getInt("id"));
			t.setDescrizione(rs.getString("descrizione"));
			tit.add(t);}
			}
			catch(SQLException e){
			System.out.println("la query non è ben strutturata!");
			}
			return tit;
			}


}
