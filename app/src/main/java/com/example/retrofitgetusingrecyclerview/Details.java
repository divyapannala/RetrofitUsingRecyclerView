package com.example.retrofitgetusingrecyclerview;

public class Details {

    private String name;
    private String email;
    private String phone;
    private address address;

    public void setName(String name) {
        this.name = name;
    }

    public Details(String name, String email, String phone, address address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
