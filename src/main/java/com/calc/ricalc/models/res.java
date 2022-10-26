package com.calc.ricalc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class res {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String user, method, fn, sn, results;

    public res(String fn, String sn, String method) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public res() {
    }

    public res(String fn, String sn, String method, String user) {
        this.fn = fn;
        this.sn = sn;
        this.method = method;
        this.user = user;
    }
}
