package com.calc.ricalc.entity;

import javax.persistence.*;

@Entity
@Table(name = "res")
public class res {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String user111;

    public String getUser111() {
        return user111;
    }

    public void setUser111(String user111) {
        this.user111 = user111;
    }

    private String method;

    private String fn;

    private String sn;

    private String results;

    public res(String fn, String sn, String method) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        this.user111 = user;
    }
}
