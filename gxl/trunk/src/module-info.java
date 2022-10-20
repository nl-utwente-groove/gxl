module nl.utwente.groove.gxl {
	exports nl.utwente.groove.gxl_1_0;

	requires jakarta.xml.bind;
	requires transitive java.xml;

	opens nl.utwente.groove.gxl_1_0 to jakarta.xml.bind;
}
