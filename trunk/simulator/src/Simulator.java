package org.iwb.simulator;
import java.util.*;

/**
 * Provides functionality that allows a derived class to act as a
 * sneakernet simulator, according to the simple model specified by
 * the <a
 * href="http://informationwithoutborders.endymion.com/index.php?title=Simulator_Code">Simulator
 * Code</a> project.
 * <p>
 * Copyright (c) 2006 <a href="http://informationwithoutborders.endymion.com">Information Without Borders</a><br>
 * Licensed under the <a href="http://www.gnu.org/copyleft/gpl.html">GNU General Public License</a>.
 *
 * @see <a href="http://informationwithoutborders.endymion.com/index.php?title=Simulator_Code">Simulator Code</a>
 *
 * @author $Author$ at <a href="http://informationwithoutborders.endymion.com">Information Without Borders</a>
 * @version $Revision$
 */
public class Simulator
{
    /**
     * Definition of a unit in time, for the logs.  Singular.
     */
    String strTimeUnit;

    /**
     * Definintion of a unit in time in plural, for the logs.  These two
     * values are the only thing that you need to change in order to change
     * the unit of time that a simulation uses.
     */
    String strTimeUnits;

    /**
     * The Locations covered in this simulator, where Data Carriers reside
     * and potentially gossip with one another.
     */
    Vector vLocations;

    /**
     * The Data Carriers that are moving from Location to Location in this
     * simulation.
     */
    Vector vDataCarriers;

    /**
     * Set up some default stuff.
     */
    public Simulator(String strTimeUnit, String strTimeUnits)
    {
	this.strTimeUnit = strTimeUnit;
	this.strTimeUnits = strTimeUnits;

	vLocations = new Vector();
	vDataCarriers = new Vector();
    }

    /**
     * Run the simulation.
     */
    public void simulate()
    {
	// Log the unit of time for this simulation.
	System.out.println();
	System.out.println("Time unit: " + strTimeUnits);

	// Print a list of locations to the log.
	System.out.println();
	System.out.println("Locations:");
	for(int index=0;index < vLocations.size();index++)
	{
	    Location location = (Location) vLocations.elementAt(index);
	    System.out.println("    " + location.strName);
	}

	// Print a list of locations to the log.
	System.out.println();
	System.out.println("Data Carriers:");
	for(int index=0;index < vDataCarriers.size();index++)
	{
	    DataCarrier dataCarrier =
		(DataCarrier) vDataCarriers.elementAt(index);
	    System.out.println("    " + dataCarrier.strName);
	}
    }
}