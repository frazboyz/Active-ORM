package org.activeorm.mapping.annotations;

import org.activeorm.ActiveRecord;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Francis on 9/04/16.
 * Project Active-ORM.
 *
 * The {@link Table} annotation is required to be
 * places on the class for each {@link ActiveRecord}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    public String name();

}
