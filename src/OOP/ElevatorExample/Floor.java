package OOP.ElevatorExample;

public enum Floor {
    ENTRANCE(0), FIRST(1),SECOND(2),THIRD(3),FOURTH(4),FIFTH(5);
    private int intFloor;

    private Floor(int intFloor){
        this.intFloor=intFloor;
    }
    int getIntFloor(){
        return intFloor;
    }

    Floor goUp(){
        Floor upperFloor=null;
        if(this==ENTRANCE)
            upperFloor=FIRST;
        else if(this ==FIRST)
            upperFloor=SECOND;
        else if(this==SECOND)
            upperFloor=THIRD;
        else if(this==THIRD)
            upperFloor=FOURTH;
        else
            upperFloor=FIFTH;
        return upperFloor;
    }

    Floor goDown(){
        Floor loweFloor=null;
        if(this==FIFTH)
            loweFloor=FOURTH;
        else if(this ==FOURTH)
            loweFloor=THIRD;
        else if(this==THIRD)
            loweFloor=SECOND;
        else if(this==SECOND)
            loweFloor=FIRST;
        else
            loweFloor=ENTRANCE;
        return loweFloor;
    }


}
