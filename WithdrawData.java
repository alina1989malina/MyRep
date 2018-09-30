package sc.admin;

/**
 * Created by alina on 15.11.2015.
 */
public class WithdrawData {

    private long gameCnt;
    private long totalIn;
    private long totalOut;
    private long totalOut1;


    // Constructor
     public WithdrawData(){

     }

    public void setWithdrawData(long gameCnt, long totalIn,long totalOut) {
        this.gameCnt = gameCnt;
        this.totalIn = totalIn;
        this.totalOut = totalOut;
    }


    // Getters

    public long getTotalIn() {
        return totalIn;
    }

    public long getGameCnt() {
        return gameCnt;
    }

    public long getTotalOut() {
        return totalOut;
    }


}
