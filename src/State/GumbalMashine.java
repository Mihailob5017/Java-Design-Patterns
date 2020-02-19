package State;

public class GumbalMashine {
    State soldOutState;
    State noQuaterState;
    State SoldState;
    State HasQuaterState;
    State state = null;
    int count = 0;

    public GumbalMashine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuaterState = new NoQuaterState(this);
        SoldState = new SoldState(this);
        HasQuaterState = new HasQuaterState(this);
        this.count = count;
        if (count <= 0)
            state = soldOutState;
        else
            state = noQuaterState;
    }

    public void inserQuater() {
        state.insertQuater();
        setState(HasQuaterState);
    }

    public void dispense() {
        state.dispense();
        count--;
        setState(noQuaterState);

    }

    public void ejectQuater() {
            state.ejectQuater();
            setState(noQuaterState);
    }

    public void setState(State state) {
            this.state=state;
    }

    public void turnCrank() {
             state.turnCrank();
            this.dispense();
            setState(noQuaterState);
    }

}
