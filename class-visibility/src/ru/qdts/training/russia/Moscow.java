package ru.qdts.training.russia;

import ru.qdts.training.usa.*;

public class Moscow {
	
	SPeterburg sp;
	Washington w;
	NewYork ny;
	
	public void visitRedSquare() {};
	void visitKremlin() {};
	private void visitKGB() {};
	
	void travelWashington() {
		Washington.visitMonument();
		Washington.visitWhiteHouse();
		Washington.visitCIA();
	}
}
