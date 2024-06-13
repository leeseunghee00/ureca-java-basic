package chapter08.section10;

public class Test {

	public static void main(String[] args) {
		// IFB ifb = new Impl();
		//
		// IFC ifc2 = (IFC) ifb;
		// ifc2.mc();

		IFC ifc = new Impl();
		ifc.mb();

		IFC ifc2 = new SubImpl();
		ifc2.mb();
	}
}
