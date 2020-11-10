import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

class ComboBoxDemo implements ActionListener { 
   JFrame frame; 
   JLabel l, l1; 
   JComboBox<String> c1; 

   ComboBoxDemo() { 
      // create a new frame 
      frame = new JFrame("ComboBox Demo"); 
      // set layout of frame 
      frame.setLayout(new FlowLayout()); 
      // array of Strings containing cities 
      String s1[] = { "Cincinnati", "Cleveland", "Dayton", "Columbus", "Other" }; 
      // create checkbox 
      c1 = new JComboBox<>(s1); 
      // add ActionListener
      c1.addActionListener(this); 
      // create labels 
      l = new JLabel("Select a city: "); 
      l1 = new JLabel(""); 
      
      frame.add(l);
      frame.add(c1);
      frame.add(l1);

      // set the size of frame 
      frame.setSize(400, 300); 
      frame.setVisible(true);
   } 
  public void actionPerformed(ActionEvent event) {
       JComboBox<String> combo = (JComboBox<String>) event.getSource();
       if(combo.equals(c1))
           l1.setText(c1.getSelectedItem() + " selected");
   }
} 
