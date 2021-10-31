package Lesson4;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Type_convention extends JFrame {

    public Type_convention() {

        super("Type conversion");
        setLayout(new FlowLayout());
        setSize(700,700);

        byte a=1;
        short b=1;
        char c=1;
        int d=1;
        long e=1;
        float f= 1.1F;
        double g=1.1;

        //create a table data
        String typeArr[] = {" ", "byte", "short", "char", "int", "long", "float", "double", "boolean"};
        Object[][] convStat = {
                {"byte", " ", (b=a) + " a",(char)a + " -",(d=a) + " a",(e=a) + " a",(f=a) + " a",(g=a) + " a", "x",
                },
                {"short",(byte)b + " -", " ",(char)b + " -",(d=b) + " a",(e=b) + " a",(f=b) + " a",(g=b) + " a", "x"
                },
                {"char",(byte)c + " -",(short)c + " -"," ",(d=c) + " a",(e=c) + " a",(f=c) + " a",(g=c) + " a", "x"
                },
                {"int",(byte)d + " -",(short)d + " -",(char)d + " -", " ",(e=d) + " a",(f=d) + " a",(g=d)+ " a", "x"
                },
                {"long",(byte)e + " -",(short)e + " -",(char)e + " -",(int)e + " -", " ",(f=e) + " a",(g=e) + " a", "x"
                },
                {"float",(byte)f + " -",(short)f + " -",(char)f + " -",(int)f + " -",(long)f + " -"," ",
                        (g=f) + " a", "x"
                },
                {"double",(byte)g + " -",(short)g + " -",(char)g + " -",(int)g + " -",(long)g + " -",(float)g + " -",
                        " ", "x"
                },
                {"boolean", "x", "x", "x", "x", "x", "x", "x", " "
                }
        };

        JTable typeTable= new JTable(convStat, typeArr);
        DefaultTableModel typeModel = new DefaultTableModel(convStat, typeArr);

        //Set center alignment
        DefaultTableCellRenderer center= new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        for(int i=1; i<=8; i++) {
            typeTable.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        add(new JScrollPane(typeTable));

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Type_convention printTable = new Type_convention();
                printTable.setLocationByPlatform(true);
                printTable.pack();
                printTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                printTable.setVisible(true);
            }
        });
    }
}