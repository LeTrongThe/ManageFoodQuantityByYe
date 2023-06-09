/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Trong The
 */
public class User {
    private String name;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean equals(Object obj){
     User u = (User) obj;
     if(this.getName() .equals(u.getName()) && this.getPassword() .equals(u.getPassword())){
      return true;
     }
     return false;
    }
    @Override
    public String toString(){
     return String.format("%s-%s", this.getName(), this.getPassword());
    }
    
}
