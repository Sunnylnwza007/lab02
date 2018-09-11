import javax.swing.*;
public class lab3_1 {
    public static void main(String[]args){
        String input =  JOptionPane.showInputDialog("input number","0");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"reject or agree"
                ,"Ark",JOptionPane.YES_NO_OPTION);

        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Love");
        }else{
            JOptionPane.showMessageDialog(null,"No Love");
        }

    }
}
