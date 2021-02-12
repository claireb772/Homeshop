package com.cursan.homeshop;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletWriter implements Writer {

    private HttpServletResponse resp;

    public ServletWriter(HttpServletResponse resp) {
        this.resp = resp;
    }



    @Override
    public void start() {

    }

    @Override
    public void writeLine(String line) {
        try {
            resp.getWriter().println("<br/>" + line);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {

    }
}
