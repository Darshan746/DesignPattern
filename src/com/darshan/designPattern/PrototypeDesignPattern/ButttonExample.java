package com.darshan.designPattern.PrototypeDesignPattern;

import javax.swing.*;
public class ButttonExample {
  public static void main(String[] args) {
    JFrame f=new JFrame("Button Example");
    JButton b=new JButton("Click Here");
    b.setBounds(50,100,95,30);
    f.add(b);
    f.setSize(800,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}