package Rooms;

import Game.Runner;
import People.Person;

public class MapRoom extends Room {

    Room[][] building;

    public MapRoom(int x, int y, Room[][] building)
    {
        super(x,y);
        this.building = building;
    }

    public void enterRoom(Person x)
    {
        System.out.println("You enter a room with a table pushed against the far wall and on top of it is a map, which looks like the following.");
        for (int i = 0; i < this.building.length; i++)
        {
            for (int j = 0; j < this.building[i].length; i++)
                System.out.print(this.building[i][j]);
            System.out.print("\n");
        }
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public String toString()
    {
        return "M";
    }
}
