/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author LudjaPae
 */
public class Content {
    private int contentID;
    private String name;
    private String detail;
    private int authorID;
    private int type;

    public Content() {
    }

    public Content(int contentID, String name, String detail, int authorID, int type) {
        this.contentID = contentID;
        this.name = name;
        this.detail = detail;
        this.authorID = authorID;
        this.type = type;
    }

    public int getContentID() {
        return contentID;
    }

    public void setContentID(int contentID) {
        this.contentID = contentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Content{" + "contentID=" + contentID + ", name=" + name + 
                ", detail=" + detail + ", authorID=" + authorID + ", type=" + type + '}';
    }
    
    
}
