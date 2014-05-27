package me.gnat008.commandsigns.databases;

import me.gnat008.commandsigns.exceptions.SignDatabaseException;
import me.gnat008.commandsigns.managers.SignManager;

import java.util.Map;

/**
 * Created by Gnat008 on 5/27/2014.
 */
public interface SignDatabase {

    public void load() throws SignDatabaseException;

    public void save() throws SignDatabaseException;

    public void load(SignManager manager) throws SignDatabaseException;

    public void save(SignManager manager) throws SignDatabaseException;

    public Map<Integer,>
}
