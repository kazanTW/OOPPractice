import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIDemo extends JFrame {
    
    public GUIDemo(String title) {
        super(title);
        this.setLocation(960, 640);
        this.setSize(480, 270);

        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.BLACK);
        contentPane.setLayout(new GridLayout(2, 2));

        GUIDemoActionListener actionListener = new GUIDemoActionListener();

        for (int i = 0; i < 4; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(actionListener);
            contentPane.add(button);
        }

        this.setVisible(true);
    }

    public static void main(String[] args) {
        GUIDemo frame = new GUIDemo("Java GUI Demo");
    }
}

class GUIDemoActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        String buttonText = clickedButton.getText();
        int textContent = Integer.parseInt(buttonText);

        clickedButton.setText(Integer.toString(++textContent));
    }
}
