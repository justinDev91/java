import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;

public class Testa {

    private JFrame chooseCruiseFrame;
    private JDateChooser availFromDate;
    private JTextField availablefromT;
    private JPanel contentPane;
    private JPanel centerP;

    public static void main(String[] args) {
        new Testa();
    }

    public Testa() {

        //////////// Creating Frame
        chooseCruiseFrame = new JFrame("");
        chooseCruiseFrame.setSize(300, 200);
        chooseCruiseFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        chooseCruiseFrame.setVisible(true);

        //////////// Creating contentPane
        contentPane = new JPanel(new GridLayout(0, 1));
        contentPane.setBackground(new java.awt.Color(255, 255, 255));
        chooseCruiseFrame.add(contentPane);
        chooseCruiseFrame.setVisible(true);

        //////////// Creating CenterP
        centerP = new JPanel();
        centerP.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.add(centerP);
        chooseCruiseFrame.add(contentPane);
        chooseCruiseFrame.setVisible(true);

        // Available From Calendar
        JLabel availF = new JLabel("Available From:");
        centerP.add(availF);
        contentPane.add(centerP);
        availablefromT = new JTextField(11);
        centerP.add(availablefromT);
        contentPane.add(centerP);
        chooseCruiseFrame.add(contentPane);
        chooseCruiseFrame.setVisible(true);

        availFromDate = new JDateChooser();
        JTextFieldDateEditor dateEditor = (JTextFieldDateEditor) availFromDate.getComponent(1);
        dateEditor.setHorizontalAlignment(JTextField.RIGHT);
        availFromDate.add(availablefromT);
        centerP.add(availFromDate);
        contentPane.add(centerP);
        chooseCruiseFrame.add(contentPane);
        chooseCruiseFrame.setVisible(true);

        // Converting Date to String
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(availFromDate.getDate());
        availablefromT.setText(date);
    }
}