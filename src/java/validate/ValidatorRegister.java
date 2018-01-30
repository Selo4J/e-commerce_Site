/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author selomongoitom
 */
public class ValidatorRegister {
public boolean validateForm(String username,
                            String password,
                   HttpServletRequest request) {

        boolean errorFlag = false;
        boolean usernameError;
        boolean passwordError;
     
        if (username == null
                || username.equals("")
                || username.length() < 3) {
            errorFlag = true;
            usernameError = true;
            request.setAttribute("usernameError", usernameError);
        }
         if (password == null
                || password.equals("")
                || password.length() < 5) {
            errorFlag = true;
            passwordError = true;
            request.setAttribute("passwordError", passwordError);
        }       

        return errorFlag;
    }
}
