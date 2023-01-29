package com.bank.exception;

import lombok.Getter;

import javax.servlet.http.HttpServletRequest;

@Getter
//@AllArgsConstructor
public class ErrorInfo {

    private final String url;
    private final String message;

    public ErrorInfo(String url, String message) {
        this.url = url;
        this.message = message;
    }

    public ErrorInfo(HttpServletRequest request, Exception ex) {
        this.url = request.getRequestURI().toString();
        this.message = ex.getMessage();
    }

    public ErrorInfo(HttpServletRequest request, String message) {
        this.url = request.getRequestURI().toString();
        this.message = message;
    }
}
