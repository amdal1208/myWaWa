package mywawa.hunter123321000.com.mywawa;

/**
 * Created by rd on 2017/10/3.
 */

public class Machine {
    public static final String REF_EXPENSES = "machine";
    String str_giftIn;
    String str_giftOut;
    int i_account;

    public Machine() {

    }

    public Machine(String str_giftIn, String str_giftOut, int i_account) {
        this.str_giftIn = str_giftIn;
        this.str_giftOut = str_giftOut;
        this.i_account = i_account;
    }

    public String getStr_giftIn() {
        return str_giftIn;
    }

    public String getStr_giftOut() {
        return str_giftOut;
    }

    public int getI_account() {
        return i_account;
    }

    public void setStr_giftIn(String str_giftIn) {
        this.str_giftIn = str_giftIn;
    }

    public void setStr_giftOut(String str_giftOut) {
        this.str_giftOut = str_giftOut;
    }

    public void setI_account(int i_account) {
        this.i_account = i_account;
    }
}
