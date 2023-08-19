package models;

import lombok.Builder;

@Builder
public class SwagLabs {

    private String username;
    private String password;
    private boolean addProduct;
    private boolean shoppingCart;
    private boolean checkout;
    private String firstName;
    private String lastName;
    private String zipCode;

    //private boolean continueButton;

}
