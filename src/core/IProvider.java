public interface IProvider {
	
	public int order(Store store, Object item, int qty) throws UnknownItemException	
}