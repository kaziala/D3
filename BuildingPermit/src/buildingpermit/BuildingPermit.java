/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege;

/**
 *
 * @author orlan
 */
public class BuildingPermit {
    public enum permits {BP2023-001, BP2023-002, BP2023-003, BP2023-004, AQSAA_PERMIT};
    public enum categories = { Residential, Commercial, Industrial, Agricultural, AQSAA_CATEGORY };
    
    private Permit permit;
    private Category category;

    public BuildingPermit(Permit permit, Category category) {
        this.permit = Permit;
        this.category = Category;
    }
    
    public Permit getPermits() {
        return permits;
    }
    
    
    public Categories getCategories() {
        return categories;
    }

    public void setPermit(Permit permit) {
        this.Permit = Permit;
    }

    public void setCategory(Category category) {
        this.Category = Category;
    }

    public String getPermit() {
        return Permit;
    }

    public Category getCategory() {
        return Category;
    }
    
}



