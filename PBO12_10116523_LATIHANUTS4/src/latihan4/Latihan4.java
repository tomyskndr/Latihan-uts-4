/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Latihan4 {
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMD = new ModelDesigner();
        ModelSystemAnalyst oMSA = new ModelSystemAnalyst();
        ModelProgrammer oMP = new ModelProgrammer();
        
        oMD.bonusDesigner();
        oMSA.bonusSystemAnalyst();
        oMP.bonusProgrammer();
    }
}
