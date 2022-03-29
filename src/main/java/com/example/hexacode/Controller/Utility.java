package com.example.hexacode.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class Utility {
    public static String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }
}
