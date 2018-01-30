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
public class ValidatorCategory {
    
 public boolean validateForm(String name,
                                HttpServletRequest request) {

        boolean errorFlag = false;
        boolean nameError;
        
        if (name == null
                || name.equals("")
                || name.length() < 3) {
            errorFlag = true;
            nameError = true;
            request.setAttribute("nameError", nameError);
        }
        
         return errorFlag;
    }
    
}

