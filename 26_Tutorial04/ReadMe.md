# RideSystem
Design a **RideSystem** in Java that uses a non-static inner class to manage individual ride bookings. The outer class, **RideService**, represents the platform with private data members: **serviceName**, **baseFarePerKm**, a fixed **MAX_RIDES** (constant), **an array of Booking objects** , and a **tripCount** . A **SURGE_MULTIPLIER** must be initialized using a static block by reading a value from the user.

The **Booking** non-static inner class stores private **passengerName** and **distanceKm**. It must feature a **constructor** using the **this** keyword and a **displayRideDetails()** method. The inner class must directly access the outer class's baseFarePerKm to calculate the final cost: 
Cost = (Distance * BaseFare * SurgeMultiplier). 

Additionally, override the **toString()** method from the Object class to return a summary of the passenger's trip.

The RideService class provides methods to **createBooking**, **calculateTotalEarnings**, and **searchPassenger** (using String class methods like equalsIgnoreCase). If the tripCount exceeds MAX_RIDES, display **"Service Busy: Driver Limit Reached"**. 

In the main method of the RideSystem class, use a do-while loop and a switch statement to provide a menu for: 
1. Book a Ride, 
2. Search Passenger, 
3. View Total Earnings, and 
4. Exit.


# CloudStream
Design a **CloudStream Subscription System** in Java that uses a non-static inner class to manage individual user subscriptions. The outer class, **SubscriptionService**, represents the platform with private data members: **serviceName**, **monthlyBaseRate**, a fixed **MAX_USERS** (constant), **an array of UserAccount objects**, and a **userCount**. A **TAX_PERCENTAGE** must be initialized using a static block by reading a value from the user.

The **UserAccount** non-static inner class stores private **userName** and **planType** (e.g., "Basic", "Premium", or "Ultra"). It must feature a **constructor** using the **this** keyword and a **displayAccountDetails()** method. The inner class must directly access the outer class's monthlyBaseRate to calculate the Final Bill using the following simple formula:

Plan Rate: Calculate based on the category:
a.	Basic: 1.0 * monthlyBaseRate
b.	Premium: 1.5 * monthlyBaseRate
c.	Ultra: 2.0  * monthlyBaseRate

Final Bill: Plan Rate + (Plan Rate * TAX_PERCENTAGE / 100)
Additionally, override the **toString()** method from the Object class to return a summary of the user's plan.

The **SubscriptionService** class provides methods to **addUser**, **calculateTotalRevenue**, and **searchUser** (using String class methods like equalsIgnoreCase). If the userCount exceeds MAX_USERS, display **"System Limit Reached: Cannot add more users"**.

In the main method of the CloudStream class, use a do-while loop and a switch statement to provide a menu for:
1.	Add User
2.	Search User
3.	View Total Revenue
4.	Exit

# LPGManagementSystem
Design an **LPG Management System** in Java that uses a non-static inner class to manage individual cargo containers. The outer class, **LPGCarrier**, represents a specialized transport ship with private data members: **shipName**, **baseStorageFee**, a fixed **MAX_CONTAINERS** (constant), **an array of Container objects**, and a **containerCount**. A **PORT_SURCHARGE_PERCENTAGE** must be initialized using a static block by reading a value from the user.

The **Container** non-static inner class stores private **containerID** and **gasType** (e.g., "Propane", "Butane", or "Mixed"). It must feature a constructor using the **this** keyword and a **displayContainerDetails()** method. The inner class must directly access the outer class's baseStorageFee to calculate the Final Storage Cost using the following formula:

Cargo Rate: Calculate based on the gas type:
a.	Propane: 1.0 * baseStorageFee
b.	Butane: 1.2 * baseStorageFee
c.	Mixed: 1.5 * baseStorageFee

Final Storage Cost: 
Cargo Rate + (Cargo Rate * PORT_SURCHARGE_PERCENTAGE / 100)
Additionally, override the **toString()** method from the Object class to return a summary of the container’s specifications.

The **LPGCarrier** class provides methods to **loadContainer**, **calculateTotalCharterValue**, and **searchContainer** (using String class methods like equalsIgnoreCase). If the containerCount exceeds MAX_CONTAINERS, display "**Ship Capacity Full: Cannot load more cargo**".

In the main method of the LPGManagementSystem class, use a do-while loop and a switch statement to provide a menu for: 
1. Load Container, 
2. Search Container by ID, 
3. View Total Charter Value, and 
4. Exit

