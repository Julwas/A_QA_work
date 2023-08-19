package models;

public class SwagLabs {

    private String username;
    private String password;
    private boolean addProduct;
    private boolean shoppingCart;
    private boolean checkout;
    private String firstName;
    private String lastName;
    private String zipCode;

    private boolean continueButton;

    public static class Builder {
        private SwagLabs newSwagLabs;

        public Builder() {
            this.newSwagLabs = new SwagLabs();
        }

        public Builder withUsername(String username) {
            newSwagLabs.username = username;
            return this;
        }
        public Builder withPassword(String password) {
            newSwagLabs.password = password;
            return this;
        }
        public Builder withAddProduct(boolean addProduct) {
            newSwagLabs.addProduct = addProduct;
            return this;
        }
        public Builder withShoppingCart(boolean shoppingCart) {
            newSwagLabs.shoppingCart = shoppingCart;
            return this;
        }
        public Builder withCheckout(boolean checkout) {
            newSwagLabs.checkout = checkout;
            return this;
        }
        public Builder withFirstName(String firstName) {
            newSwagLabs.firstName = firstName;
            return this;
        }
        public Builder withLastName(String lastName) {
            newSwagLabs.lastName = lastName;
            return this;
        }
        public Builder withZipCode(String zipCode) {
            newSwagLabs.zipCode = zipCode;
            return this;
        }

        public SwagLabs build() {
            return newSwagLabs;
        }
    }

}
