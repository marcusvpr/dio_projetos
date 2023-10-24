
public class ContaCorrente extends Conta{
	
	@Override
	public void extrato() {
		System.out.println("-------Extrato Conta Corrente-------");
		super.infoComuns();
	}
	
}
