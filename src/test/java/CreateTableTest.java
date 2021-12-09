import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CreateTableTest {

    @Test
    public void createFirstTable() throws SQLException {
        CreateTable create = new CreateTable();
        create.creating_table();
    }
    @Test
    public void createSecondTable() throws SQLException {
        CreateTable create = new CreateTable();
        create.creating_table_another_table();
    }
}