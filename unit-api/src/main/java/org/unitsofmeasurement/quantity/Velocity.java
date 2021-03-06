/**
 * Unit-API - Units of Measurement API for Java (http://unitsofmeasurement.org)
 * Copyright (c) 2005-2010, Unit-API contributors, JScience and others
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package org.unitsofmeasurement.quantity;


/**
 * Distance traveled divided by the time of travel.
 * The metric system unit for this quantity is "m/s" (metre per second).
 *
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @version 1.0
 *
 * @see Length
 * @see Time
 * @see Acceleration
 * @see AngularVelocity
 *
 * @deprecated Renamed {@link Speed}, because speed is a scalar value while velocity is a vector.
 */
@Deprecated
public interface Velocity extends Quantity<Velocity> {
}
