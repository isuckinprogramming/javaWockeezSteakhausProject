package DataModification;

import DatabaseTables.Customer;
import DatabaseTables.Reservations;
import SystemObjects.DatabaseInitialize;

public class CustomerEntryProcess {

  public CustomerEntryProcess(
      int customerId,
      String firstname,
      String lastname,
      String email,
      int contactNumber,
      int reservationid

  ) {

    this.customerId = customerId;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.contactNumber = contactNumber;
    this.reservationid = reservationid;

    this.testingInputDataToCustomer();
  }

  int customerId;
  String firstname;
  String lastname;
  String email;
  int contactNumber;
  int reservationid;

  public static void main(String[] args) {

    CustomerEntryProcess test = new CustomerEntryProcess(
        6969,
        "Jude",
        "Rafael",
        "member@gmail.com",
        696_696,
        454444);

    test.testingInputDataToCustomer();
  }

  protected void testingInputDataToCustomer() {

    DatabaseInitialize.DatabaseStart();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase(getDataInsertionQuery());
  }

  public String getAllConcatenatedCustomerDetails() {

    return " ( " +
        customerId + " , \"" +
        firstname + "\" , \"" +
        lastname + "\" , \"" +
        email + "\" , " +
        contactNumber + " , " +
        reservationid +
        " ) ";
  }

  public String getDataInsertionQuery() {

    return "INSERT INTO " + Customer.tableName + getAllConcatenationOfColumns() + " VALUES "
        + getAllConcatenatedCustomerDetails();
  }

  public String getAllConcatenationOfColumns() {
    return " ( " +
        Customer.CustomerIDColumn + " , " +
        Customer.FirstNameColumn + " , " +
        Customer.LastNameColumn + " , " +
        Customer.EmailColumn + " , " +
        Customer.contactNumberColumn + " , " +
        Customer.ReservationIDColumn + " ) ";
  }
}
