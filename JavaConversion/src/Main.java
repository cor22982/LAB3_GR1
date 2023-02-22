public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ConvertBinari convertidor = new ConvertBinari();
		ConvertoHexa convertidorhexa = new ConvertoHexa();
		convertidor.setNumber("10111001");
		System.out.println(convertidor.Complement2());
		System.out.println(convertidor.Complement1());
		System.out.println(convertidorhexa.DecimalToHexa(966));
		System.out.println(convertidorhexa.HexatoDecimal("3C6"));
	}

}
