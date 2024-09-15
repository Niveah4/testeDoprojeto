package servicos;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class CPFFormatterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CPF Formatter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new java.awt.FlowLayout());

        try {
            // Cria um campo de texto formatado com máscara para CPF
            JFormattedTextField cpfField = new JFormattedTextField(createFormatter("###.###.###-##"));
            cpfField.setColumns(14); // Ajusta o tamanho do campo de entrada
            frame.add(new JLabel("Digite o CPF:"));
            frame.add(cpfField);

            frame.setVisible(true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static MaskFormatter createFormatter(String mask) throws ParseException {
        MaskFormatter formatter = new MaskFormatter(mask);
        formatter.setPlaceholderCharacter('_'); // Caracter para posições não preenchidas
        formatter.setAllowsInvalid(false); // Não permite valores inválidos
        return formatter;
    }
}
