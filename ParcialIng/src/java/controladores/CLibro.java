/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Libro;

/**
 *
 * @author 202
 */
@WebServlet(name = "CLibro", urlPatterns = {"/CLibro"})
public class CLibro extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          RequestDispatcher dispatcher;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String accion= request.getParameter("a");
     
        if(accion.equals("crear")){
        dispatcher = request.getRequestDispatcher("WEB-INF/vistas/libro/iLibro.html");
       dispatcher.forward(request,response);
            }
       if(accion.equals("guardar")){
      
   
              
        String titulo=request.getParameter("titulo");
        String autor=request.getParameter("autor");
        int referencia=Integer.parseInt(request.getParameter("referencia"));
        String fPublicacion=request.getParameter("fPublicacion");
        boolean eLibro=Boolean.parseBoolean(request.getParameter("eLibro"));
        String descripcion=request.getParameter("descripcion");
        int nPaginas=Integer.parseInt( request.getParameter("nPaginas"));
        
        
       Libro l=new Libro(titulo,autor,fPublicacion,descripcion,referencia,nPaginas,eLibro);
       
        dispatcher= request.getRequestDispatcher("WEB-INF/vistas/libro/index.html");
        dispatcher.forward(request, response);
   
   }
          
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
