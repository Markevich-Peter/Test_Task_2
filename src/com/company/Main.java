package com.company;

import sun.plugin2.message.ShowDocumentMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Window window = new Window("Окошко проверки");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //закроется если нажать  на крестик
        window.setSize(500, 500);                                    //задается размер фрейма
        window.setResizable(false);                                  //нельзя растягитвать окно
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
//-----------------------------------------------------------------------------------------------------------
class Window extends JFrame
{
    JLabel label_1;
    JLabel label_2;
    JLabel label_3;

    JTextField field_1;
    JTextField field_1_2;
    JTextField field_2;
    JTextField field_2_2;
    JTextField field_3;
    JTextArea field_3_2;
    JTextField field_4, field_5, field_6, field_7,field_8, field_9, field_10, field_11,field_12;

    JButton check, enter;

    Event k = new Event();

    public Window(String title)
    {
        super(title);
        setLayout(null);

        label_1 = new JLabel("Поле ввода для задания №1");
        label_1.setBounds(25, 15, 175, 30);
        add(label_1);
        field_1 = new JTextField();
        field_1.setBounds(25, 55, 175, 30);
        field_1.setToolTipText("Введите целое число");
        add(field_1);
        field_1_2 = new JTextField();
        field_1_2.setBounds(325, 55, 150, 30);
        field_1_2.setEditable(false);                                      //нельзя редактировать содержимое поля
        add(field_1_2);
//---------------------------------------------------------------------------------
        label_2 = new JLabel("Поле ввода для задания №2");
        label_2.setBounds(25, 90, 175, 30);
        add(label_2);
        field_2 = new JTextField();
        field_2.setBounds(25, 130, 175, 30);
        field_2.setToolTipText("Введите имя кириллицей");
        add(field_2);
        field_2_2 = new JTextField();
        field_2_2.setBounds(325, 130, 150, 30);
        field_2_2.setEditable(false);
        add(field_2_2);
//-----------------------------------------------------------------------------
        label_3 = new JLabel("Заполите 10 ячеек массива ");
        label_3.setBounds(25, 170, 175, 30);
        add(label_3);
        //-1
        field_3 = new JTextField();
        field_3.setBounds(25, 210, 30, 30);
        add(field_3);
        //-2
        field_4 = new JTextField();
        field_4.setBounds(60, 210, 30, 30);
        add(field_4);
        //-3
        field_5 = new JTextField();
        field_5.setBounds(95, 210, 30, 30);
        add(field_5);
        //-4
        field_6 = new JTextField();
        field_6.setBounds(130, 210, 30, 30);
        add(field_6);
        //-5
        field_7 = new JTextField();
        field_7.setBounds(165, 210, 30, 30);
        add(field_7);
        //-6
        field_8 = new JTextField();
        field_8.setBounds(25, 250, 30, 30);
        add(field_8);
        //-7
        field_9 = new JTextField();
        field_9.setBounds(60, 250, 30, 30);
        add(field_9);
        //-8
        field_10 = new JTextField();
        field_10.setBounds(95, 250, 30, 30);
        add(field_10);
        //-9
        field_11 = new JTextField();
        field_11.setBounds(130, 250, 30, 30);
        add(field_11);
        //-10
        field_12 = new JTextField();
        field_12.setBounds(165, 250, 30, 30);
        add(field_12);

        //----------------------------------------------------------------------
        field_3_2 = new JTextArea();
        field_3_2.setBounds(325, 210, 150, 120);
        field_3_2.setEditable(false);
        add(field_3_2);
//-------------------------------------------------------------------------
        check = new JButton("Проверить");
        check.setBounds(210, 55, 100, 105);
        add(check);
//-------------------------------------------------------------------------
        check.addActionListener(k);
//------------------------------------------------------------------------
        enter = new JButton("Обработать   массива");
        enter.setBounds(25, 300, 170, 30);
        add(enter);
        enter.addActionListener(k);
    }

    class Event implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
//         if (e.getSource() == check && field_1.getText() != null )
            if (e.getSource() == check)
            {
//--------------Первое задание-----------------------------------------------------------

                try {
                    field_1_2.setText(null);
                    String str_1 = field_1.getText();
                    int z = Integer.parseInt(str_1);
                    if (z > 7) {
                        field_1_2.setText("Привет");
                    } else {
                        field_1_2.setText(null);
                    }
                } catch (Exception m)   { }




//---------------Второе зание-----------------------------------------------------------
                try
                {
                    field_2_2.setText(null);
                    String str_2 = field_2.getText();
                    if (str_2.equals("Вячеслав")) {
                        field_2_2.setText("Привет, Вячеслав");
                    }
                }catch (Exception m){}
            }
//---------------Tретье задание----------------------------------------------------------

            if (e.getSource() == enter )
            {
                try
                {
                    int[] arr = new int[10];
                    String str_3 = field_3.getText();
                    arr[0] = Integer.parseInt(str_3);
                    String str_4 = field_4.getText();
                    arr[1] = Integer.parseInt(str_4);
                    String str_5 = field_5.getText();
                    arr[2] = Integer.parseInt(str_5);
                    String str_6 = field_6.getText();
                    arr[3] = Integer.parseInt(str_6);
                    String str_7 = field_7.getText();
                    arr[4] = Integer.parseInt(str_7);
                    String str_8 = field_8.getText();
                    arr[5] = Integer.parseInt(str_8);
                    String str_9 = field_9.getText();
                    arr[6] = Integer.parseInt(str_9);
                    String str_10 = field_10.getText();
                    arr[7] = Integer.parseInt(str_10);
                    String str_11 = field_11.getText();
                    arr[8] = Integer.parseInt(str_11);
                    String str_12 = field_12.getText();
                    arr[9] = Integer.parseInt(str_12);

                    for (int i = 0; i < 10; i++) {
                        if (arr[i] % 3 == 0)
                        {
//                            String d = "";
//                            d = d + Integer.toString(arr[i]) + System.getProperty("line.separator");
//                            field_3_2.setText(d);
                            field_3_2.setText(field_3_2.getText() + "   " + Integer.toString(arr[i]));
                        }
                    }
                } catch (Exception j){JOptionPane.showMessageDialog(null, "Не все ячейки заполнены");}
            }

        }
    }
}


