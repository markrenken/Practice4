/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import business.Person;
import data.EmployeeManagerDA;
import java.io.IOException;
import java.time.LocalDate;
import static java.time.LocalDate.parse;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
public class Controller extends HttpServlet {

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
        String url = "/index.jsp";
        ArrayList<Person> persons = null;
        String actionWanted = request.getParameter("actionWanted");
        String range = request.getParameter("range");
        String message1 = "";
        String message2 = "";
        String dateWanted = "";

        if (actionWanted.equals("search") || actionWanted.equals("again")) {
            url = "/search.jsp";
        }

        if (actionWanted.equals("searchDate")) {
            String date = request.getParameter("date");
            if (date.isEmpty()) {
                message1 = "Please Enter a Date";
                url = "/search.jsp";
            } else {
                if (range != null) {
                    dateWanted = date;
                    LocalDate dateToSearch = parse(date);
                    persons = EmployeeManagerDA.search(dateToSearch, range);
                    url = "/employeeListSearched.jsp";
                } else {
                    dateWanted = date;
                    message2 = "Please Select a Button";
                    url = "/search.jsp";
                }
            }
        }

        if (actionWanted.equals("home")) {
            persons = EmployeeManagerDA.getAllEmployees();
            url = "/index.jsp";
        }

        request.setAttribute("persons", persons);
        request.setAttribute("message1", message1);
        request.setAttribute("message2", message2);
        request.setAttribute("dateWanted", dateWanted);
        request.setAttribute("range", range);

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

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
