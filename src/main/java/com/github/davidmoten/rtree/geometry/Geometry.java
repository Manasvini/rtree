package com.github.davidmoten.rtree.geometry;

import com.github.davidmoten.rtree.Entry;

/**
 * A geometrical region that represents an Entry spatially. It is recommended
 * that implementations of this interface implement equals() and hashCode()
 * appropriately that {@link Entry} equality checks work as expected.
 */
public interface Geometry {

	/**
	 * Returns the distance to the given {@link Rectangle}. For a
	 * {@link Rectangle} this might be Euclidean distance but for an EPSG4326
	 * lat-long Rectangle might be great-circle distance.
	 * 
	 * @param r
	 *            rectangle to measure distance to
	 * @return distance to the rectangle r from the geometry
	 */
	double distance(Rectangle r);

	/**
	 * Returns the minimum bounding rectangle of this geometry.
	 * 
	 * @return minimum bounding rectangle
	 */
	Rectangle mbr();
}
