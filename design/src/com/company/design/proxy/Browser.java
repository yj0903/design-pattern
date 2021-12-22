package com.company.design.proxy;

public class Browser implements IBrowser{
    private String url;

    // default constructor
    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser load html from : "+url);
        return new Html(url);
    }
}
