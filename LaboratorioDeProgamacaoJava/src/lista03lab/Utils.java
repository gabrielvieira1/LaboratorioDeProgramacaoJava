package lista03lab;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class Utils {
	public static void main(String[] args) {
		Contato c = new Contato();
		String ddd = c.getDdd();

		// cpf começa aqui
		String cpf = c.getCpf();
		try {
			System.out.println(formatarCPF(cpf));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// telefone começa aqui
		String celular = c.getCelular();
		try {
			System.out.println(formatarCPF(celular));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String cep = c.getCep();
		try {
			System.out.println(formatarCEP(cep));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static String formatarCEP(String cep) throws ParseException {
		Contato c = new Contato();
		MaskFormatter mf = new MaskFormatter("#####-###");
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(cep);
	}

	public static String formatarCelular(String telefone) throws ParseException {
		Contato c = new Contato();
		MaskFormatter mf = new MaskFormatter(c.ddd + " " + "#####-####");
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(telefone);
	}

	public static String formatarCPF(String cpf) throws ParseException {
		MaskFormatter mf = new MaskFormatter("###.###.###-##");
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(cpf);
	}

}
