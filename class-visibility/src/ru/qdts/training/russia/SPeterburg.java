package ru.qdts.training.russia;

import ru.qdts.training.usa.Washington;
import static ru.qdts.training.usa.Washington.visitMonument;
import static ru.qdts.training.usa.Washington.visitWhiteHouse;
import static ru.qdts.training.usa.Washington.visitCIA;

class SPeterburg {
	
	Moscow m;
	Washington w;
	NewYork ny;
	
	public void travelMoscow() {
		Moscow m = new Moscow();
		m.visitRedSquare();
		m.visitKremlin();
		m.visitKGB();
	}
	
	private void travelWashington() {
		Washington.visitMonument();
		Washington.visitWhiteHouse();
		Washington.visitCIA();
	}
}
