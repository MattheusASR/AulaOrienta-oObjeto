package br.com.db1.db1start.ExercicioInterface;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	public String autenticar() {
		return "Diretor AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}
}
