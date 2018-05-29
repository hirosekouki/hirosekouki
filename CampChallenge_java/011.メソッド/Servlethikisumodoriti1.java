/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hikisumodoriti1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;  //追加した項目
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kouki
 */
@WebServlet(name = "Servlethikisumodoriti1", urlPatterns = {"/Servlethikisumodoriti1"})
public class Servlethikisumodoriti1 extends HttpServlet {

    private Object[] profile;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //プロフィール3人分書いて配列にする
      String[] profile(String id){
         // Objects.requireNonNull(id);
      String[][] profile_list = {
              {"hirose","1997","東京都"},
              {"akito","2000","神奈川"},
              {"nagano","2005","鹿児島"}
          };
      //（"hirose","akito","nagano")を表示しないためのコードが欲しい
      //３つの配列を表示したい
        for (String[] profile : profile_list){
           if (id.equals("hirose")){
         //  if (id.equals("akito"))
             return profile;
            

}
        
        
 
        }
     // return new String[0];
        return null;       
      }
       


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        //IDと同じIDが含んだprofileを比較、表示したい
        //三つのprofileを表示したい
       String[] a = profile("hirose");
     
        for (int i = 1 ; i <a.length; i++){
          //   if (i == 0) {
           //       continue;
        
            out.print(a[i]);
           // out.print(a[2]);
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

   
    
