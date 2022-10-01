package com.example.hwlesson21;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletDateTimeNow", urlPatterns = "/date/time_now")
public class ServletDateTimeNow extends HttpServlet {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("H:mm:ss");
    private static final String COUNTRY_AND_CITY = "Republic of Belarus,Minsk";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy _ H:mm:s");
        writer.printf("<h1>%s</h1>", COUNTRY_AND_CITY);
        writer.printf("<h2> Date - %s </h2>", LocalDate.now().format(DATE_FORMAT));
        writer.printf("<h2> Time - %s </h2>", LocalTime.now().format(TIME_FORMAT));
    }
}