import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class design extends JFrame {
    private JButton button = new JButton("RESULT");
    public JTextField n1 = new JTextField("",5);
    public JTextField n2 = new JTextField("",5);
    private JLabel label = new JLabel("input:");
    public JRadioButton AN = new JRadioButton("addition",false);
    private JRadioButton SN = new JRadioButton("subtraction",false);
    private JRadioButton MN = new JRadioButton("multiplication",false);
    private JRadioButton DN = new JRadioButton("division",false);
    public design() {
        super("calculator");
        this.setBounds(100, 100, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 3));
        container.add(label);
        container.add(n1);
        container.add(n2);
        ButtonGroup group = new ButtonGroup();
        group.add(AN);
        group.add(SN);
        group.add(MN);
        group.add(DN);
        container.add(AN);
        container.add(SN);
        container.add(MN);
        container.add(DN);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
//    int n1;
//    int n2;
//    Boolean AN;
//    Boolean SN;
//    Boolean MN;
//    Boolean DN;
//    int res;
//
//    // AN = addition
//    // SN = subtraction
//    // MN = multiplication
//    // DN = division
//        if(AN=true) {
//        res = n1 + n2;
//    }
    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = Integer.parseInt(n1.getText());
            int number2 = Integer.parseInt(n2.getText());
            int res=0;
            if(AN.isSelected()){
                res = number1 + number2;
            }
            if(SN.isSelected()) {
                res = number1 - number2;
                String MA ="SN";
            }
            if(MN.isSelected()) {
                res = number1 * number2;
            }
            if(DN.isSelected()) {
                res = number1 / number2;
            }
            String message = "";
            message += "Result: "+ res +";\n";
            message += "First number is = " + n1.getText() + ";\n";
            message += "Second number is = " + n2.getText() + ";\n";
            message += "Mathematical action " + (AN.isSelected() ? "addition" : (SN.isSelected() ? "subtraction": (MN.isSelected() ? "multiplication" : "division"))) + " is selected.";
            JOptionPane.showMessageDialog(null, message, "AGAIN",JOptionPane.PLAIN_MESSAGE);


        }
    }
}
