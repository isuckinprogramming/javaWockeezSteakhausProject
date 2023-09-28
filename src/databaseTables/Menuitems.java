package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Menuitems implements DBEntity {

  private String tableName = "menuitems"; 

  @Override
  public String getStringSQLQuery() {
    return
    "CREATE TABLE " + tableName + " ( " +
    "      item_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,\r\n" + //
    "      itemName VARCHAR(255) NOT NULL ,\r\n" + //
    "      itemDescription Varchar(255) NOT NULL,\r\n" + //
    "      itemPrice INT NOT null , \r\n" + //
    "      categories ENUM (\r\n" + //
    "        'undecided',\r\n" + //
    "        'Appetizers',\r\n" + //
    "        'Dessert',\r\n" + //
    "        'HeavyDish',\r\n" + //
    "        'LightDish',\r\n" + //
    "        'NonAlcoholicDrinks',\r\n" + //
    "        'AlcoholicDrinks'    \r\n" + //
    "      ) NOT NULL DEFAULT 'undecided'\r\n" + //
    "    )"
    ;
  }

  @Override
  public String getTableName() {
    return tableName;
  }

}
