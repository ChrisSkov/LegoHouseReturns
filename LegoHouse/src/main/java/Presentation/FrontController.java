/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chris Skov
 */
@WebServlet(name = "FrontController", urlPatterns =
{
    "/FrontController"
})
public class FrontController extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException
    {

        response.setContentType("text/html;charset=UTF-8");

        String origin = request.getParameter("origin");
        switch (origin)
        {
            case "index":
                index(request, response);
                break;
            case "shop":
                shop(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
     private void shop(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("shop.jsp").forward(request, response);
    }
}
