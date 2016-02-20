package edu.towson.cis.cosc442.project1.monopoly;

/**
 * this is the interface for the cell class
 * on the basis that there will be a new
 * ability in the game to own more things.
 */
public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	boolean playAction(String msg);

	void setTheOwner(Player owner);

	String toString();

	boolean isAvailable();

	void setAvailable(boolean available);

}