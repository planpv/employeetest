/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pplan
 */
public class employee {
   
    //default constructor
    public employee() {
        firstname = "none";
        lastname = "none";
        salary = 0.0;
    }
   
    public employee(String fn, String ln, double s) {
        firstname = fn;
        lastname = ln;
        salary = s;
    }
   
    private string firstname;
    private string lastname;
    private double salary;

    public string getFirstname() {
        return firstname;
    }

    public string getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstname(string firstname) {
        this.firstname = firstname;
    }

    public void setLastname(string lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        }
        else {
            this.salary = salary;
        }
       
    }
   
}
