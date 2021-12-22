package com.company.design.proxy;

public class BrowserProxy implements IBrowser{
    private String url;
    private Html html;

    // default constructor
    public BrowserProxy (String url){
        this.url = url;
    }


    @Override
    public Html show() {
        if(html == null){
            System.out.println("Proxy browser load html from : "+url);
            this.html = new Html(url);
        }
        System.out.println("Proxy browser use cache html : "+url);
        return html;
    }
}
