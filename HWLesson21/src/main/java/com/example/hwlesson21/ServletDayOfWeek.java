package com.example.hwlesson21;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "ServletDayOfWeek", urlPatterns = "/date/day_of_week")
public class ServletDayOfWeek extends HttpServlet {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final String INCORRECT_DATE = "Date entered incorrectly, must be entered in the format day/month/year";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String date = request.getParameter("Date");
        LocalDate localDate = null;
        try {
            localDate = LocalDate.parse(date, DATE_FORMAT);
            if (!localDate.format(DATE_FORMAT).equals(date)) {
                throw new RuntimeException();
            }
            String dayOfWeek = localDate.getDayOfWeek().toString().toLowerCase();
            writer.printf("<h2>Day of week is:</h2>" + "<h1>%s</h1>", dayOfWeek);
        } catch (RuntimeException e) {
            writer.printf("<h1>%s</h1>", INCORRECT_DATE);
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
