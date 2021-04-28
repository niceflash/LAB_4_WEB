package com.controller;

import com.model.Character;
import com.model.Main;
import com.model.Tasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "ControllerServlet", value = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Main main = new Main();

        request.setAttribute("withoutRole", main.getWithoutRole().toArray());
        request.setAttribute("playWith", main.getPlayWith());
        request.setAttribute("muchMore", main.getMuchMore());
        request.setAttribute("all", main.getAllCinemas());
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
