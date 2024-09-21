/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.breakout.ball.game;

import javax.swing.JFrame;

/**
 *
 * @author ritika
 */
public class BreakoutBallGame {

    public static void main(String[] args) {
        JFrame obj= new JFrame();
        GamePlay gamePlay= new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
