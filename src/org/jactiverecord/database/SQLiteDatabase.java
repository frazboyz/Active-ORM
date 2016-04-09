package org.jactiverecord.database;

import org.jactiverecord.database.configuration.SQLiteDatabaseConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Francis on 9/04/16.
 * Project Jactive-Record.
 *
 * A SQLite {@link Database} implementation.
 */
public class SQLiteDatabase extends Database {

    /**
     * Constructs a new {@link SQLiteDatabase}
     *
     * @param configuration the database configuration object
     */
    public SQLiteDatabase(final SQLiteDatabaseConfiguration configuration) {
        super(configuration);
    }

    public Connection connect() {
        try {
            final Connection connection = DriverManager.getConnection("jdbc:sqlite:" + super.configuration.address);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}