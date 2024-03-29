/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import connectionDB.ConnectionAgent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LudjaPae
 */
public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String profilePIC;
    private String telephone;
    private String address;
    private String province;
    private String amphur;
    private String zipcode;
    private int relatedUserID;
    private int hospitalID;
    private String currentmed;
    private String pastmed;
    private int type;

    public User() {
    }

    public User(int userID, String username, String password, String email, 
            String firstname, String lastname, String profilePIC, String telephone, 
            String address, String province, String amphur, String zipcode, 
            int relatedUserID, int hospitalID, String currentmed, String pastmed, int type) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.profilePIC = profilePIC;
        this.telephone = telephone;
        this.address = address;
        this.province = province;
        this.amphur = amphur;
        this.zipcode = zipcode;
        this.relatedUserID = relatedUserID;
        this.hospitalID = hospitalID;
        this.currentmed = currentmed;
        this.pastmed = pastmed;
        this.type = type;
        
        
    }

    public User(String username, String password, String email, String firstname, String lastname, String profilePIC, String telephone, String address, String province, String amphur, String zipcode) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.profilePIC = profilePIC;
        this.telephone = telephone;
        this.address = address;
        this.province = province;
        this.amphur = amphur;
        this.zipcode = zipcode;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfilePIC() {
        return profilePIC;
    }

    public void setProfilePIC(String profilePIC) {
        this.profilePIC = profilePIC;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getRelatedUserID() {
        return relatedUserID;
    }

    public void setRelatedUserID(int relatedUserID) {
        this.relatedUserID = relatedUserID;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getCurrentmed() {
        return currentmed;
    }

    public void setCurrentmed(String currentmed) {
        this.currentmed = currentmed;
    }

    public String getPastmed() {
        return pastmed;
    }

    public void setPastmed(String pastmed) {
        this.pastmed = pastmed;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public static int registerUser(User u){
        String sqlCmd = "INSERT INTO APP.ACCOUNT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int values = 0;
        try {
            PreparedStatement pstm = ConnectionAgent.getConnection().prepareStatement(sqlCmd);
            pstm.setString(2, u.getUsername());
            pstm.setString(3, u.getPassword());
            pstm.setString(4, u.getEmail());
            pstm.setString(5, u.getFirstname());
            pstm.setString(6, u.getLastname());
            pstm.setString(7, u.getProfilePIC());
            pstm.setString(8, u.getTelephone());
            pstm.setString(9, u.getAddress());
            pstm.setString(10, u.getProvince());          
            pstm.setString(11, u.getAmphur());          
            pstm.setString(12, u.getZipcode());
            pstm.setInt(13, u.getRelatedUserID());
            pstm.setInt(14, u.getHospitalID());
            pstm.setString(15, u.getCurrentmed());
            pstm.setString(16, u.getPastmed());
            pstm.setInt(17, u.getType());
            
            
            values = pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return values;  
    }

    public static int register(User u){
        Connection con = ConnectionAgent.getConnection();
        String sqlCmd = "INSERT INTO 'User' ('userID', 'username', 'password', 'email', "
                + "'firstname', 'lastname', 'profilePIC', 'telephone', 'address', 'province', "
                + "'amphur', 'zipcode', 'relatedUserID', 'hospitalID', 'currentmed', 'pastmed', "
                + "'type') VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?)";
        int values = 0;
        try {
            PreparedStatement pstm = ConnectionAgent.getConnection().prepareStatement(sqlCmd);
            pstm.setInt(1, getLastestId()+1);
            pstm.setString(2, u.getUsername());
            pstm.setString(3, u.getPassword());
            pstm.setString(4, u.getEmail());
            pstm.setString(5, u.getFirstname());
            pstm.setString(6, u.getLastname());
            pstm.setString(7, u.getProfilePIC());
            pstm.setString(8, u.getTelephone());
            pstm.setString(9, u.getAddress());
            pstm.setString(10, u.getProvince());          
            pstm.setString(11, u.getAmphur());          
            pstm.setString(12, u.getZipcode());
            pstm.setInt(13, u.getRelatedUserID());
            pstm.setInt(14, u.getHospitalID());
            pstm.setString(15, u.getCurrentmed());
            pstm.setString(16, u.getPastmed());
            pstm.setInt(17, u.getType());
            
            values = pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return values;  
    }
    
    
    public static int getLastestId() {
        int latestId = 0;

        Connection conn = ConnectionAgent.getConnection();

        String sql = "select * from User order by userid desc limit 0,1";
        Statement st;
        try {

            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                latestId = rs.getInt("userid");
            }

            return latestId;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return latestId;
    }
    
    public static User getUser(String user) {
        String sql = "select username ,password ,email ,firstname ,lastname ,profilePIC ,telephone ,address ,province ,amphur ,zipcode from User where username= ?";
        PreparedStatement ps;
        User u = null;
        try {
            ps = ConnectionAgent.getConnection().prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setUsername(rs.getString(1));
                u.setPassword(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setFirstname(rs.getString(4));
                u.setLastname(rs.getString(5));
                u.setProfilePIC(rs.getString(6));
                u.setTelephone(rs.getString(7));
                u.setAddress(rs.getString(8));
                u.setProvince(rs.getString(9));
                u.setAmphur(rs.getString(10));
                u.setZipcode(rs.getString(11));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
     private static void rToO(User u, ResultSet rs) {
        try {
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setEmail(rs.getString("email"));
            u.setFirstname(rs.getString("firstname"));
            u.setLastname(rs.getString("lastname"));
            u.setProfilePIC(rs.getString("profilePIC"));
            u.setTelephone(rs.getString("telephone"));
            u.setAddress(rs.getString("address"));
            u.setProvince(rs.getString("province"));
            u.setAmphur(rs.getString("amphur"));           
            u.setZipcode(rs.getString("zipCode"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", username=" + username + ", password=" 
                + password + ", email=" + email + ", firstname=" + firstname + ", lastname=" 
                + lastname + ", profilePIC=" + profilePIC + ", telephone=" + telephone + 
                ", address=" + address + ", province=" + province + ", amphur=" + amphur + 
                ", zipcode=" + zipcode + ", relatedUserID=" + relatedUserID + ", hospitalID=" + 
                hospitalID + ", currentmed=" + currentmed + ", pastmed=" + pastmed + ", type=" + type + '}';
    }
    
    
}
