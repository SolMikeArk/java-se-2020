package ru.qdts.training.usa;

import ru.qdts.training.russia.Moscow;
import ru.qdts.training.russia.SPeterburg;

public class Washington {
		
	Moscow m;
	SPeterburg sp;
	NewYork ny;
	
	public static void visitMonument() {};
	static void visitWhiteHouse() {};
	private static void visitCIA() {};
	
	public void travelMoscow() {
		Moscow m = new Moscow();
		m.visitRedSquare();
		m.visitKremlin();
		m.visitKGB();
	}
}
