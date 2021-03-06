package org.activeorm.database.datahandler;

import org.activeorm.exceptions.DataHandleException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Francis on 1/05/16.
 * Project Jactive-Record.
 */
public class LongHandler implements Handler<Long> {

    @Override
    public Long get(final int index, final ResultSet resultSet) {
        try {
            return resultSet.getLong(index);
        } catch (SQLException e) {
            throw new DataHandleException(index, "Long");
        }
    }

    @Override
    public void set(final int index, final Long value, final PreparedStatement statement) {
        try {
            statement.setLong(index, value);
        } catch (SQLException e) {
            throw new DataHandleException(index, "Long");
        }
    }
}

