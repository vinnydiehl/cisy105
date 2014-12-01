/**
 * Calculates the assessment value and property tax of a property.
 * Lab 11 - 01 December 2014
 *
 * @author Vinny Diehl
 */

package src;

// GUI libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaxCalculator extends JFrame
{
    private JPanel pnlMain, pnlInput, pnlOutput;
    private JTextField txtValue, txtAssessment, txtTax;
    private JButton btnCalculate;

    public TaxCalculator()
    {
        super("Property Tax Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();

        add(pnlMain);

        pack();

        setVisible(true);
    }

    /**
     * Creates all components and builds all panels
     */
    private void initializeComponents()
    {
        /** Input **/

        pnlInput = new JPanel();

        txtValue = new JTextField(10);

        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new CalcButtonListener());

        pnlInput.add(new JLabel("Actual Value:"));
        pnlInput.add(txtValue);
        pnlInput.add(btnCalculate);

        /** Output **/

        pnlOutput = new JPanel();

        txtAssessment = new JTextField(10);
        txtTax = new JTextField(10);

        pnlOutput.setLayout(new GridLayout(2, 2));
        pnlOutput.add(new JLabel("Assessment Value:"));
        pnlOutput.add(txtAssessment);
        pnlOutput.add(new JLabel("Property Tax:"));
        pnlOutput.add(txtTax);

        /** Main Panel **/

        pnlMain = new JPanel();
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.PAGE_AXIS));
        pnlMain.add(pnlInput);
        pnlMain.add(pnlOutput);
    }

    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double assessment = Double.parseDouble(txtValue.getText()) * 0.6;
            txtAssessment.setText(currency(assessment));
            txtTax.setText(currency(assessment * 0.0064));
        }
    }

    /**
     * Returns +value+ as a string formatted into USD.
     *
     * @param value the value in USD
     * @return +value+ as a string formatted into USD
     */
    public static String currency(double value)
    {
        return String.format("$%.2f", value);
    }

    public static void main(String[] args)
    {
        new TaxCalculator();
    }
}
