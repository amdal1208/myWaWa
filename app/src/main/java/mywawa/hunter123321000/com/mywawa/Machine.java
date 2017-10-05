package mywawa.hunter123321000.com.mywawa;

/**
 * Created by rd on 2017/10/3.
 */

public class Machine {
    public static final String REF_EXPENSES = "machine";
    String giftIn;
    String giftOut;
    int account;

    public Machine() {

    }

    public Machine(String giftIn, String giftOut, int account) {
        this.giftIn = giftIn;
        this.giftOut = giftOut;
        this.account = account;
    }

    public void setGiftIn(String giftIn) {
        this.giftIn = giftIn;
    }

    public void setGiftOut(String giftOut) {
        this.giftOut = giftOut;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getGiftIn() {

        return giftIn;
    }

    public String getGiftOut() {
        return giftOut;
    }

    public int getAccount() {
        return account;
    }
}
