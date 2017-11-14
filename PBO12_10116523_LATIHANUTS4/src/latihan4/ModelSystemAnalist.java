/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author user
 */
public class ModelSystemAnalist extends ModelEmployee{
     int bonus;

    public ModelSystemAnalist() {
        this.bonus = 90000;
    }

    public void bonusSystemAnalyst() {
        System.out.println("Salary Employee System Analyst = " + super.salary);
        System.out.println("Bonus System Analyst = " + bonus);
    }
}
