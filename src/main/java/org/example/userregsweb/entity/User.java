package org.example.userregsweb.entity;


import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Table(name = "user")
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username",length = 255,nullable = false)
    private String username;

    @Column(name = "tel_no",length = 45)
    private String tel_no;

    @Column(name = "password",length = 255)
    private String password;

    public User() {

    }

    public User(int id, String username, String tel_no, String password) {
        this.id = id;
        this.username = username;
        this.tel_no = tel_no;
        this.password = password;
    }

    public User(String username, String tel_no, String password) {
        this.username = username;
        this.tel_no = tel_no;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
