package sk.akademiasovy.tipos;

import java.util.Date;

/**
 * Created by host on 31.1.2018.
 */
public class Bet {
    private int id;
    private int iduser;

    public int getId() {
        return id;
    }

    public int getIduser() {
        return iduser;
    }

    public Date getDate() {
        return date;
    }

    public int getDraw_id() {
        return draw_id;
    }

    public int getBet1() {
        return bet1;
    }

    public int getBet2() {
        return bet2;
    }

    public int getBet3() {
        return bet3;
    }

    public int getBet4() {
        return bet4;
    }

    public int getBet5() {
        return bet5;
    }

    private Date date;
    private int draw_id;
    private int bet1;
    private int bet2;
    private int bet3;
    private int bet4;
    private int bet5;

    public Bet(int id, int iduser, Date date, int bet1, int bet2, int bet3, int bet4, int bet5) {
        this.id = id;
        this.iduser = iduser;
        this.date = date;
        this.bet1 = bet1;
        this.bet2 = bet2;
        this.bet3 = bet3;
        this.bet4 = bet4;
        this.bet5 = bet5;
    }


}