package Template.example;

public class SlowOrderProcessor extends AOrderProcessor {

    @Override
    public float getShippingFee(IOrder order) {
        return 0;
    }

    @Override
    public int getShippingTime(IOrder order) {
        return 0;
    }

    @Override
    public void sendConfirmation(String orderDetails, float shippingFee, int shippingTime) {

    }
}
