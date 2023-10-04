package DataModification;

import DatabaseTables.CustomerService;
import SystemObjects.DatabaseInitialize;

public class CustomerServiceEntryProcess {

  public CustomerServiceEntryProcess(
      int customerId,
      int employeeId,
      int reservationId

  ) {

    this.customerId = customerId;
    this.employeeId = employeeId;
    this.reservationId = reservationId;

    testingInputDataToCustomerServiceTable();
  }

  int customerId;
  int employeeId;
  int reservationId;

  public static void main(String[] args) {

    CustomerServiceEntryProcess test = new CustomerServiceEntryProcess(
        6969,
        6969,
        69);

    test.testingInputDataToCustomerServiceTable();
  }

  protected void testingInputDataToCustomerServiceTable() {

    DatabaseInitialize.DatabaseStart();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase(getDataInsertionQuery());
  }

  public String getAllConcatenatedCustomerServiceDetails() {

    return " ( " +
        customerId + " ,  " +
        employeeId + " , " +
        reservationId + " ) ";
  }

  public String getDataInsertionQuery() {
    return "INSERT INTO " + CustomerService.tableName +
        getAllConcatenationOfColumns() +
        " VALUES " + getAllConcatenatedCustomerServiceDetails();
  }

  public String getAllConcatenationOfColumns() {
    return " ( " +
        CustomerService.customerIdColumn + " , " +
        CustomerService.employeeIdColumn + " , " +
        CustomerService.reservationIdColumn + " ) ";
  }

}
