package com.example.mongodb.springbootmongoexample.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {

    @Id
    private ObjectId _id;

    private String firstName;

    private String lastName;

    private String pwd;

    private int age;

    public Users() {
    }

    public Users(ObjectId _id, String firstName, String lastName, String pwd, int age) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pwd = pwd;
        this.age = age;
    }

    // ObjectId needs to be converted to string?
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
