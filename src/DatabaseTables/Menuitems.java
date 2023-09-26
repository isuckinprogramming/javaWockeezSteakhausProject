package DatabaseTables;

import java.sql.Connection;

import DatabaseObjectTemplates.DBEntity;

public class Menuitems implements DBEntity {

    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");

        return "CREATE TABLE MenuItems ( \r\n" + //
                "  item_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,\r\n" + //
                "  itemName VARCHAR(255) NOT NULL ,\r\n" + //
                "  itemDescription Varchar(255) NOT NULL,\r\n" + //
                "  itemPrice INT NOT null , \r\n" + //
                "  categories ENUM (\r\n" + //
                "    'undecided',\r\n" + //
                "    'Appetizers',\r\n" + //
                "    'Dessert',\r\n" + //
                "    'HeavyDish',\r\n" + //
                "    'LightDish',\r\n" + //
                "    'NonAlcoholicDrinks',\r\n" + //
                "    'AlcoholicDrinks'    \r\n" + //
                "  ) NOT NULL DEFAULT 'undecided'\r\n" + //
                ")";
    }

    @Override
    public void CreateTable(Connection connection) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CreateTable'");
    }

    @Override
    public void truncateTable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'truncateTable'");
    }
    
}
