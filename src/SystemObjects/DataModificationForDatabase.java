package SystemObjects;

import java.util.Random;

public class DataModificationForDatabase {

    public static void main(String[] args) {
        // createReservationAndCustomerEntry(new P, null, null, null, 0, null, null, 0,
        // 0);
    }

    public static void createReservationAndCustomerEntry(
            ProgramUser programUserReference,
            // customer data
            String customerFirstname,
            String customerLastname,
            String customerEmail,
            int customerContactNumber,
            // reservation data
            String startTime,
            String endTime,
            int partSize,
            int roomId) {

        int reservationId = generateId();
        int customerId = generateId();

        ReservationProcess reserve = new ReservationProcess(
                reservationId,
                startTime,
                endTime,
                partSize,
                roomId);

        CustomerEntryProcess customerEntry = new CustomerEntryProcess(
                customerId,
                customerFirstname,
                customerLastname,
                customerEmail,
                customerContactNumber,
                reservationId);

        CustomerServiceEntryProcess customerServeEntry = new CustomerServiceEntryProcess(
                customerId,
                programUserReference.getCurrentEmployeeId(),
                reservationId);
    }

    public static int generateId() {
        return new Random().nextInt(10_000);
    }
}
