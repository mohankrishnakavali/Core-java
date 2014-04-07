package com.scjp1;

import com.scjp1.Nav.Direction;

class Nav{
	public enum Direction{NORTH, EAST,WEST,SOUTH}
	
}
public class EnumTest {
	//Direction d=NORTH;
	//Nav.Direction d=NORTH;
	Direction d=Direction.NORTH;
	Nav.Direction d1=Nav.Direction.EAST;
}
