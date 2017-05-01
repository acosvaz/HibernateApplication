/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.tutorial.domain;

import java.util.Date;

/**
 *
 * @author ivette
 */
public class Employee {
    private Long id;
    private String fullname;
    private Date ndate;

    public Employee() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return ndate;
    }

    public void setDate(Date ndate) {
        this.ndate = ndate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname (String fullname) {
        this.fullname = fullname;
    }
}
