package pruebas;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import mundo.Hermafrodita;

import mundo.Hombre;

import mundo.Mujer;

class TestMujer extends TestCase {
	
	//RELACIONES//
	private Mujer laMujer;
	
	//ESCENARIO//
	public void escenario() {
		laMujer = new Mujer('A', 'B', 'C', 'D', 'A', 'A', 'C', 'C', 'D', 'A', "Luisa", "Luisa", Mujer.BI, "Medicina", 1.59, 20, 4);
	}
	
	//TEST//	
	@Test
	public void testEmparejar1(){
		escenario();
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		laMujer.compareTo(laPareja);
		try {
			laMujer.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertEquals(laMujer.getPareja(), laPareja);
		}
	}
	
	@Test
	public void testEmparejar2() {
		escenario();
		laMujer.setIdSexual(Mujer.HOMO);
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		laMujer.compareTo(laPareja);
		try {
			laMujer.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(laMujer.getPareja());
		}
	}
	
	@Test
	public void testEmparejar3() {
		escenario();
		Mujer laPareja = new Mujer('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Marta", "Ramirez", Mujer.HOMO, "Telemática", 1.7, 20, 6);
		laMujer.compareTo(laPareja);
		laMujer.setPopularidad(8);
		try {
			laMujer.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(laMujer.getPareja());
		}
	}
	
	@Test
	public void testEmparejar4() {
		escenario();
		Hermafrodita laPareja = new Hermafrodita('A', 'C', 'A', 'A', 'C', 'A', 'C', 'C', 'C', 'C', "Alberto", "Ramirez", Mujer.HOMO, "Administración", 1.7, 20, 6);
		laMujer.compareTo(laPareja);
		try {
			laMujer.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(laMujer.getPareja());
		}
	}
}
