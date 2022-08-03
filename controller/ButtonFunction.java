/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;

import java.awt.event.ActionEvent;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public interface ButtonFunction {
    public void editButtonActionPerformed(ActionEvent evt, int id);
    public void deleteButtonActionPerformed(ActionEvent evt, int id);
    public void addButtonActionPerformed(ActionEvent evt);
    public void resetButtonActionPerformed(ActionEvent evt);
    public void backButtonActionPerformed(ActionEvent evt);
}
