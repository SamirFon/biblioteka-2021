package biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import biblioteka.interfejs.BibliotekaInterfejsTest1;

class BibliotekaTest1 extends BibliotekaInterfejsTest1 {

	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	@AfterEach
	void tearDown() throws Exception {
		biblioteka  = null;
	}

	

}
