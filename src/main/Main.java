package main;

import Fsm.FsmException;
import Fsm.Event;
import Fsm.Transition;
import action.*;
import event.*;
import state.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FsmException {

        MYFSM fsm = new MYFSM("ActiveClient", new StateClosed());
        init(fsm);
        System.out.printf("\nTCP fsm started successfully.\nPlease enter event name:\n");

        Scanner input = new Scanner(System.in);
        String command = input.next();

        while(command != null) {
            System.out.printf("\ncurrent state is \n", fsm.currentState());
            try {
                fsm.doEvent(getEvent(command));
            } catch(FsmException e) {
                System.out.printf("%s\n", e.toString());
            } catch (EventException e) {
                System.out.printf("%s\n", e.toString());
            }
            command = input.next();
        }
        input.close();
    }

    private static void init(MYFSM fsm) throws FsmException {
        StateClosed closed = new StateClosed();
        StateClosing closing = new StateClosing();
        StateCloseWait close_wait = new StateCloseWait();
        StateEstablished established = new StateEstablished();
        StateFinWait1 fin_wait_1 = new StateFinWait1();
        StateFinWait2 fin_wait_2 = new StateFinWait2();
        StateLastAck last_ack = new StateLastAck();
        StateListen listening = new StateListen();
        StateSynSent syn_sent = new StateSynSent();
        StateSynRcvd syn_rcvd = new StateSynRcvd();
        StateTimeWait time_wait = new StateTimeWait();

        EventAck eventAck = new EventAck();
        EventActive eventActive = new EventActive();
        EventClose eventClose = new EventClose();
        EventFin eventFin = new EventFin();
        EventPassive eventPassive = new EventPassive();
        EventRdata eventRdata = new EventRdata();
        EventSdata eventSdata = new EventSdata();
        EventSyn eventSyn = new EventSyn();
        EventSynAck eventSynAck = new EventSynAck();
        EventTimeout eventTimeOut = new EventTimeout();

        Transition closedToListen = new Transition(closed, eventPassive, listening, new ActionNone());
        Transition closedToSynSent = new Transition(closed, eventActive, syn_sent, new ActionSyn());
        Transition listenToClosed = new Transition(listening, eventClose, closed, new ActionClose());
        Transition listenToSynRecvd = new Transition(listening, eventSyn, syn_rcvd, new ActionSynAck());
        Transition synRecvdToEstablished = new Transition(syn_rcvd, eventAck,  established, new ActionNone());
        Transition synSentToEstablished = new Transition(syn_sent, eventSynAck,  established, new ActionAck());
        Transition synRecvdToFinWait1 = new Transition(syn_rcvd, eventClose, fin_wait_1, new ActionFin());
        Transition finWait1ToFinWait2 = new Transition(fin_wait_1, eventAck, fin_wait_2, new ActionNone());
        Transition finWait2ToTimeWait = new Transition(fin_wait_2, eventFin, time_wait, new ActionAck());
        Transition finWait1ToClosing = new Transition(fin_wait_1, eventFin, closing, new ActionAck());
        Transition closingToTimeWait = new Transition(closing, eventAck, time_wait, new ActionNone());
        Transition timeWaitToClosed = new Transition(time_wait, eventTimeOut, closed, new ActionClose());
        Transition synSentToClosed = new Transition(syn_sent, eventClose, closed, new ActionClose());
        Transition synSentToSynRecvd = new Transition(syn_sent, eventSyn, syn_rcvd, new ActionSynAck());
        Transition establishedToCloseWait = new Transition(established, eventFin, close_wait, new ActionAck());
        Transition finClosingToLastAck = new Transition(close_wait, eventClose, last_ack, new ActionFin());
        Transition lastAckToClosed = new Transition(last_ack, eventAck, closed, new ActionClose());
        Transition establishedToFinWait1 = new Transition(established, eventClose, fin_wait_1, new ActionFin());
        Transition establishedRdata = new Transition(established, eventRdata, established, new ActionRecv());
        Transition establishedSdata = new Transition(established, eventSdata, established, new ActionSend());

        fsm.addTransition(closedToListen);
        fsm.addTransition(closedToSynSent);
        fsm.addTransition(listenToClosed);
        fsm.addTransition(listenToSynRecvd);
        fsm.addTransition(synRecvdToEstablished);
        fsm.addTransition(synRecvdToFinWait1);
        fsm.addTransition(finWait1ToFinWait2);
        fsm.addTransition(finWait2ToTimeWait);
        fsm.addTransition(finWait1ToClosing);
        fsm.addTransition(closingToTimeWait);
        fsm.addTransition(timeWaitToClosed);
        fsm.addTransition(synSentToClosed);
        fsm.addTransition(synSentToSynRecvd);
        fsm.addTransition(synSentToEstablished);
        fsm.addTransition(establishedToCloseWait);
        fsm.addTransition(establishedToFinWait1);
        fsm.addTransition(finClosingToLastAck);
        fsm.addTransition(lastAckToClosed);
        fsm.addTransition(establishedRdata);
        fsm.addTransition(establishedSdata);

    }

    public static Event getEvent(String input) throws EventException {
        if (input.equals("PASSIVE")) {
            return new EventPassive();
        }
        else if(input.equals("ACTIVE")) {
            return new EventActive();
        }
        else if (input.equals("SYN")) {
            return new EventSyn();
        }
        else if (input.equals("SYNACK")) {
            return new EventSynAck();
        }
        else if (input.equals("ACK")) {
            return new EventAck();
        }
        else if (input.equals("RDATA")) {
            return new EventRdata();
        }
        else if (input.equals("SDATA")) {
            return new EventSdata();
        }
        else if (input.equals("SYN")) {
            return new EventSyn();
        }
        else if (input.equals("FIN")) {
            return new EventFin();
        }
        else if (input.equals("CLOSE")) {
            return new EventClose();
        }
        else if (input.equals("TIMEOUT")) {
            return new EventTimeout();
        }
        throw new EventException("Error: unexpected Event: " + input + "\n");
    }

}
