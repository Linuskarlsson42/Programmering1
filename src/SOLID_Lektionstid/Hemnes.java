package SOLID_Lektionstid;

public class Hemnes implements Ikea{

	@Override
	public void Material() {
		// TODO Auto-generated method stub
		System.out.println("Träfiberskiva, Akrylfärg, Polyesterfärg");
	}

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("Denna vackra soffa kommer kosta dig en fina 3295 svenska riksdaler");
	}

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Hemnes:");
	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Hemnes kommer i två fina färger. Vit och grått");
	}

	@Override
	public void Kopa() {
		// TODO Auto-generated method stub
		System.out.println("JA såklart de ju ändå en fin soffa att ställa i köket eller hallen!");
	}

}
