import javax.swing.JOptionPane;
public class patyf14sept23 {
    public static void main(String []args){
        double ope1, ope2, r;
        String ops1, ops2;
        JOptionPane.showMessageDialog(null, "Suma");
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero");
        ope2=Double.parseDouble(ops2);
        r=ope1+ope2;
                JOptionPane.showMessageDialog(null, "suma="+r);
    //resta
        JOptionPane.showMessageDialog(null, "Resta");
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero");
        ope2=Double.parseDouble(ops2);
        r=ope1-ope2;
                JOptionPane.showMessageDialog(null, "Resta="+r);
    //multiplicacion
        JOptionPane.showMessageDialog(null, "Multiplicacion");
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero");
        ope2=Double.parseDouble(ops2);
        r=ope1*ope2;
                JOptionPane.showMessageDialog(null, "Multiplicacion="+r);
    //division
        JOptionPane.showMessageDialog(null, "Division");
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero");
        ope2=Double.parseDouble(ops2);
        r=ope1/ope2;
                JOptionPane.showMessageDialog(null, "Division="+r);
    
    }
    
}
