/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author LudjaPae
 */
public class Register extends HttpServlet {

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
        String username =request.getParameter("username");
            String pwd1 =request.getParameter("pwd1");
            String pwd2 =request.getParameter("pwd2");
            String email =request.getParameter("email");
            String firstname =request.getParameter("firstname");
            String lastname =request.getParameter("lastname");
            String profilePIC =request.getParameter("profilePIC");
            String telephone =request.getParameter("telephone");
            String address =request.getParameter("address");
            String province =request.getParameter("province");
            String amphur =request.getParameter("amphur");
            String zipcode =request.getParameter("zipcode");
            System.out.println("im herer");
            
            if(!pwd1.equals(pwd2)){
            request.setAttribute("msg","Passwords don't Match!!");
        }else{
            if(User.getUser(username)!=null){
                request.setAttribute("msg","This Username is Exist");
            }else{
                User u = new User(username ,pwd1 ,email ,firstname ,lastname ,profilePIC ,
                        telephone ,address ,province ,amphur ,zipcode);
                User.registerUser(u);
                request.setAttribute("msg","Succeed!!");
                System.out.println(u);
            }
        }
        getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
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
