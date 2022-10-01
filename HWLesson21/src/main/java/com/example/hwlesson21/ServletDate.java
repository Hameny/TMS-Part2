package com.example.hwlesson21;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDate", urlPatterns = "/date")
public class ServletDate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        try (writer) {
            writer.println("<html>" +
                    "<h1>Enter date in format :</h1>" +
                    "<h2>day/month/year</h2>" +
                    "<h2>day,month,year - numbers</h2>" +
                    "<body>" +
                    "<form action=\"/HWLesson21/date/day_of_week\" method=\"POST\">" +
                    "<p>Date to determine the day of the week:</p>"+
                    "<input type=\"text\" name=\"Date\"><br>" +
                    "<input type=\"submit\" value=\"Display the day of the week\"/>" +
                    "</form>" +
                    "<form action=\"/HWLesson21/date/number_of_year\" method=\"POST\">" +
                    "<p>Date to determine day's number of year</p>"+
                    "<input type=\"text\" name=\"Date\"><br>" +
                    "<input type=\"submit\" value=\"Display number of year\"/>" +
                    "</form>" +
                    "</body>" +
                    "</html>");
        }
    }
}
