interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }
}

public class OnlineCoupon {
    public static void main(String[] args) {

        String[] coupons = {"SAVE10", "OFF50", "SAVE20", "123"};

        ShoppingCart cart = new ShoppingCart();

        for (String c : coupons) {
            if (cart.validateCoupon(c))
                System.out.println(c + " Valid");
            else
                System.out.println(c + " Invalid");
        }
    }
}