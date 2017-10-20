package mywawa.hunter123321000.com.mywawa;

/**
 * Created by rd on 2017/10/3.
 */

public class Machine {
    public static final String REF_EXPENSES = "machine";
    int giftIn;
    int giftOut;
    int account;

    public Machine() {

    }

    public Machine(int giftIn, int giftOut, int account) {
        this.giftIn = giftIn;
        this.giftOut = giftOut;
        this.account = account;
    }

    public void setGiftIn(int giftIn) {
        this.giftIn = giftIn;
    }

    public void setGiftOut(int giftOut) {
        this.giftOut = giftOut;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getGiftIn() {

        return giftIn;
    }

    public int getGiftOut() {
        return giftOut;
    }

    public int getAccount() {
        return account;
    }
}
