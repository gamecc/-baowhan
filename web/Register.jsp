<%-- 
    Document   : Register
    Created on : Aug 28, 2014, 5:43:35 PM
    Author     : LudjaPae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Register Page</title>
    </head>
    <body>
        
        <br/>
        <div align="center"><font size="48">BAOWHAN</font></div>
        <form action="Register" method="Get" name="Reg1" >
                            <div align="center">
                                <table width="500px" border="1" align="center">
                                    <tr>
                                        <td align="right">Username : </td>
                                        <td><input type="username" name="username" size="20" required=""/></td>
                                    </tr>	

                                    <tr>
                                        <td align="right">Password :</td>
                                        <td><input type="password" name="pwd1" required=""/> </td>
                                    </tr>
                                    <tr>
                                        <td align="right">Re-Enter Password :</td>
                                        <td><input type="password" name="pwd2" required=""/> </td>
                                    </tr>
                                    <tr>
                                        <td align="right">Email :</td> 
                                        <td><input type="email" name="email" required=""/></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Firstname :</td>
                                        <td><input type="firstname" name="firstname" required=""/></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Lastname: </td>
                                        <td><input type="lastname" name="lastname" required=""/></td>
                                    </tr>
                                    
                                    <tr>
                                        <td align="right">Telephone : </td>
                                        <td><input type="telephone" name="telephone" required=""/></td>
                                    </tr>                                 
                                    <tr>
                                        <td align="right" valign="top">Address :</td>
                                        <td> <textarea rows="5" cols="50" name="address" required=""></textarea></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Province : </td>
                                        <td><input type="province" name="province" required=""/></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Amphur : </td>
                                        <td><input type="amphur" name="amphur" required=""/></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Zipcode :</td> 
                                        <td><input type="zipcode" name="zipcode" required=""/></td>
                                    </tr>
                                    <tr align="center">
                                        <td colspan='2' align="center">
                                            <input type="submit" value="Sign Up" />
                                            <input type="reset" value="Reset" />
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </form> 
    </body>
</html>
