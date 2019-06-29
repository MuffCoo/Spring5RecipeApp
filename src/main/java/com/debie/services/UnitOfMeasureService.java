package com.debie.services;

import java.util.Set;

import com.debie.commands.UnitOfMeasureCommand;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
