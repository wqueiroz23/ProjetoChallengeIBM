package br.com.studybot.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aula;
import br.com.studybot.dao.AulaDAO;

public class TesteListarAula {

	public static void main(String[] args) {
		try {
			AulaDAO dao=new AulaDAO();
			List<Aula>lista=new ArrayList<>();
			String nome=JOptionPane.showInputDialog("Digte um nome");
			lista=dao.mostrarAula("");
			
			for(Aula aula :lista) {
				
				System.out.println(aula.getNome());
				
			}
			
		}catch(Exception e ) {
			System.out.println(e);
			
		}

	}

}
