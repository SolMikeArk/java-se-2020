package ru.qdts.training.usa;

import ru.qdts.training.russia.*;

class NewYork {
	
	Moscow m;
	SPeterburg sp;
	Washington w;
		
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
