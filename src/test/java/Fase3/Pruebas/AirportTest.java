package Fase3.Pruebas;

import Fase3.Produccion.BusinessFlight;
import Fase3.Produccion.EconomyFlight;
import Fase3.Produccion.Flight;
import Fase3.Produccion.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

   // Refactorización de la clase AirportTest. Pregunta 3

    private Passenger pasajero ;
   class EconomyFlightTest {

       private Flight economyFlight;

       @BeforeEach
       void setUp() {
           economyFlight = new EconomyFlight("1");
       }

       @Test
       public void testEconomyFlightRegularPassenger() {
           pasajero = new Passenger("Jessica", false);

           assertEquals("1", economyFlight.getId());
           assertTrue(economyFlight.addPassenger(pasajero));
           assertEquals(1, economyFlight.getPassengersList().size());
           assertEquals("Jessica", economyFlight.getPassengersList().get(0).getName());

           assertTrue(economyFlight.removePassenger(pasajero));
           assertEquals(0, economyFlight.getPassengersList().size());

       }

       @Test
       public void testEconomyFlightVipPassenger() {
           pasajero = new Passenger("Cesar", true);

           assertEquals("1", economyFlight.getId());
           assertTrue(economyFlight.addPassenger(pasajero));
           assertEquals(1, economyFlight.getPassengersList().size());
           assertEquals("Cesar", economyFlight.getPassengersList().get(0).getName());

           assertFalse(economyFlight.removePassenger(pasajero));
           assertEquals(1, economyFlight.getPassengersList().size());
       }

   }

    @DisplayName("Dado que hay un vuelo negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            pasajero = new Passenger("Jessica", false);

            assertFalse(businessFlight.addPassenger(pasajero));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertFalse(businessFlight.removePassenger(pasajero));
            assertEquals(0, businessFlight.getPassengersList().size());
        }

        @Test
        public void testBusinessFlightVipPassenger() {
            pasajero= new Passenger("Cesar", true);

            assertTrue(businessFlight.addPassenger(pasajero));
            assertEquals(1, businessFlight.getPassengersList().size());
            assertFalse(businessFlight.removePassenger(pasajero));
            assertEquals(1, businessFlight.getPassengersList().size());

        }

    }
}
