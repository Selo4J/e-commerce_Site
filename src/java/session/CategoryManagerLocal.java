/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Category;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author tomsol28
 */
@Local
public interface CategoryManagerLocal {

    void addCategory(Category category);

    void editCategory(Category category);

    void deleteCategory(Integer id);

    Category getCategory(Integer id);

    List<Category> getAllCategory();
    
}
