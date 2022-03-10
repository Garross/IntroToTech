package com.ourLibrary
import javax.swing.*

fun UIhackedForCLI(): DoubleArray {
    var UIresults = DoubleArray(3)
    var aField = JTextField(5)
    var bField = JTextField(5)
    var cField = JTextField(5)

    var myPanel = JPanel()
    myPanel.add(JLabel("a:"))
    myPanel.add(aField)
    myPanel.add(Box.createHorizontalStrut(15)) // a spacer
    myPanel.add(JLabel("b:"))
    myPanel.add(bField)
    myPanel.add(Box.createHorizontalStrut(15)) // a spacer
    myPanel.add(JLabel("c:"))
    myPanel.add(cField)

    var result = JOptionPane.showConfirmDialog(null, myPanel,
        "Please Enter ax²+bx+c Values", JOptionPane.OK_CANCEL_OPTION)
    if (result == JOptionPane.OK_OPTION) {
        UIresults[0] = (aField.getText()).toDouble()
        UIresults[1] = (bField.getText()).toDouble()
        UIresults[2] = (bField.getText()).toDouble()

    }
    return UIresults
}