/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hikisuumodoriti3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hnori
 */
@WebServlet(name = "Servlethikisuumodoriti3", urlPatterns = {"/Servlethikisuumodoriti3"})
public class Servlethikisuumodoriti3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String[] profile(String id){
        String[] prof1 ={"hirose","1997",null};
        String[] prof2 ={"akito","2000","神奈川"};
        String[] prof3 ={"nagano","2005","鹿児島"};
           if(id.equals("hirose")){
               return prof1;
           }else if(id.equals("akito")){
               return prof2;
           }else if(id.equals("nagano")){
               return prof3;
          }
      
      return prof1;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String[] b = null;
            int limit = 2;
         
            for (int i = 0; i < limit; i++){
                
                if(i ==0){
                   b = profile("hirose");
                }else if(i == 1){
                   b = profile("akito");
                }else if(i == 2){
                    b = profile("nagano");
                }
                
                for (int j = 0; j < 3; j++){
                
                    if (b[j] == null){

                       continue;
                    }else{
                    out.print(b[j]);
                    }
         
            
                } 
            }
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
            throws ServletException, IOException {
        processRequest(request, response);
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
