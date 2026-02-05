public interface IStoreCart {

    public boolean isAvailable( Object item, int qty );

	public Cart addItemToCart(
	            Cart cart,
	            Client client,
	            Object item,
	            int qty )
	    throws UnknownItemException, InvalidCartException;

	public Order pay( Cart cart, String address, String bankAccountRef );

}