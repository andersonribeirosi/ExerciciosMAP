public class FabricaDeFiltros {
	public FilterOp gotham() {
		FilterOp f = new Modulate(100, 15, 100);
		f.nextOp(new Fill("#333c7c")).nextOp(new Colorize(15)).nextOp(new Gama(0.3)).nextOp(new Contrast());
		return f;
	}
}