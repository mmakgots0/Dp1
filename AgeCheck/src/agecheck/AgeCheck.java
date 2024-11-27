/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agecheck;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gcca32
 */
public class AgeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p=new Scanner (System.in);
        System.out.println("Enter your age");
        int Age= p.nextInt();
        if(Age>= 18){
            JOptionPane.showMessageDialog(null, "You are legal");
        }
        else{
            JOptionPane.showMessageDialog(null, "you are not legal");
        }
    }
    
    
}
