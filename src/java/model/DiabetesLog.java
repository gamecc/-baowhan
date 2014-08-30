/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LudjaPae
 */
public class DiabetesLog {
    private int logId;
    private int userId;
    private double value;
    private String note;
    private Date checktime;
    private Date logtime;

    public DiabetesLog() {
    }

    public DiabetesLog(int logId, int userId, double value, String note, Date checktime, Date logtime) {
        this.logId = logId;
        this.userId = userId;
        this.value = value;
        this.note = note;
        this.checktime = checktime;
        this.logtime = logtime;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    @Override
    public String toString() {
        return "DiabetesLog{" + "logId=" + logId + ", userId=" + userId + ", value=" + value + ", note=" + note + ", checktime=" + checktime + ", logtime=" + logtime + '}';
    }
    
    private static void rToO(DiabetesLog dl, ResultSet rs) {
        try {
            dl.setLogId(rs.getInt("logId"));
            dl.setUserId(rs.getInt("userId"));
            dl.setValue(rs.getDouble("value"));
            dl.setNote(rs.getString("note"));
            dl.setChecktime(rs.getDate("checktime"));
            dl.setLogtime(rs.getDate("logtime"));
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
