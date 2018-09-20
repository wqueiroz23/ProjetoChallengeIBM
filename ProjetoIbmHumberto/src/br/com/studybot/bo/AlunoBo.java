package br.com.studybot.bo;

import br.com.studybot.beans.Aluno;

public class AlunoBo {
	
	public static String novoAluno(Aluno objAluno)throws Exception{
		
		if(objAluno.getNome().length()>50) {
			return "Nome invalido";
		}
		
		if(objAluno.getIdade()<18) {
			return "A idade minima permitida é 18 anos";
		}
		
		
		
		return"";
		
	}

}
