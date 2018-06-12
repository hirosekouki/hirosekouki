/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hnori
 */
public class BlackJack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        Dealer D = new Dealer();
        User U = new User();
        
        D.setCard(D.deal()); //dealしたカードを手札にセット
        U.setCard(D.deal());
        
        out.print("最初のDealerの手札は" + D.open() +"<br>");//手札の合計値を表示
        out.print("最初のUserの手札は" + U.open() + "<br>");
       
        if(D.checkSum()){
            D.setCard(D.hit());
        }
        
        if(U.checkSum()){
            U.setCard(D.hit());
        }
        
        out.print("最終的なDealerの手札の合計値は" + D.open() + "<br>");
        out.print("最終的なUserの手札の合計値は" + U.open() + "<br>");
        
        if(D.open() > 21 && U.open() > 21){
            out.print("引き分け");
        }else if(D.open() > 21 ){
            out.print("ユーザーが勝ち");
        }else if(U.open() > 21){
            out.print("ディーラーの勝ち");
        }else if(D.open() < U.open()){
            out.print("ユーザーの勝ち");
        }else if(D.open() > U.open()){
            out.print("ディーラーの勝ち");
        }else if(D.open() == U.open()){
            out.print("引き分け");
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
