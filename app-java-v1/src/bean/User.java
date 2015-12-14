/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author moulaYounes
 */
public class User {
    private String id;
    private String password;
    private int bloqued;

    public User() {
    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String password, int bloqued) {
        this.id = id;
        this.password = password;
        this.bloqued = bloqued;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", password=" + password + ", bloqued=" + bloqued + '}';
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBloqued() {
        return bloqued;
    }

    public void setBloqued(int bloqued) {
        this.bloqued = bloqued;
    }
    
    
    
}
