//MemoryPlus
//Michael Olvera
//SP21-CPSC-24500-001

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import java.util.ArrayList;
import java.util.Random;


class MemoryFrame extends JFrame {
    
    public MemoryFrame() {
        setBounds (200,200,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}


public class MemoryPlus {
    public static void main(String[] args) {
        System.out.println("MemoryPlus Starting...");

        MemoryFrame myMemoryFrame = new MemoryFrame();
        myMemoryFrame.setVisible(true);

    }
}