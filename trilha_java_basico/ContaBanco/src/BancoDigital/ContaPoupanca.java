
public class ContaPoupanca extends Conta{

	@Override
	public void extrato() {
		System.out.println("-------Extrato Conta Poupan�a-------");
		super.infoComuns();
	}

}
