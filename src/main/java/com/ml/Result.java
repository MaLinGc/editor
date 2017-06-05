package com.ml;

public class Result {

    private int success;
    private String message;
    private String url;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Result() {
    }

    public Result(int success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(int success, String message, String url) {
        this.success = success;
        this.message = message;
        this.url = url;
    }
}
