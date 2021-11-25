package main;


import Fsm.*;

public class MYFSM extends FSM {
    private int sdata_count;


    private int rdata_count;
    boolean trace = false;

    public int get_sdata_count() {
        return this.sdata_count;
    }

    public int get_rdata_count() {
        return this.rdata_count;
    }

    public void reset_data_count() {
        this.sdata_count = 0;
        this.rdata_count = 0;
    }

    public void sdata_incur() {
        this.sdata_count ++;
    }

    public void rdata_incur() {
        this.rdata_count ++;
    }

    public MYFSM(String fsmName, State start) {
        super(fsmName, start);
        this.reset_data_count();
    }

}
