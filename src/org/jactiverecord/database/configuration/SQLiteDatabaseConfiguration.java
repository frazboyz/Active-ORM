package org.jactiverecord.database.configuration;

/**
 * Created by Francis on 9/04/16.
 * Project Jactive-Record.
 *
 * A SQLite database configuration object
 */
public class SQLiteDatabaseConfiguration extends DatabaseConfiguration {

    /**
     * Constructs a new {@link SQLiteDatabaseConfiguration}
     * @param address the address of the SQLLite database
     */
    public SQLiteDatabaseConfiguration(final String address) {
        super(address, null, null);
    }

}
