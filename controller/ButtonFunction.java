/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;

import java.awt.event.ActionEvent;

/**
 *
 * @author arthu
 */
public interface ButtonFunction {
    public void editButtonActionPerformed(ActionEvent evt, int id);
    public void deleteButtonActionPerformed(ActionEvent evt, int id);
    public void addButtonActionPerformed(ActionEvent evt);
    public void resetButtonActionPerformed(ActionEvent evt);
    public void backButtonActionPerformed(ActionEvent evt);
}
