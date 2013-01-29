/*******************************************************************************
 * Copyright (c) 2013 Luigi Sgro. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Luigi Sgro - initial API and implementation
 ******************************************************************************/
package com.quantcomponents.series.jdbc;

import java.sql.SQLException;
import java.util.List;

import com.quantcomponents.marketdata.ITickPoint;

public interface ITickPointDao extends IFlushable, IDbInitializable {
	void save(String stockDatabaseId, ITickPoint item) throws SQLException;
	List<ITickPoint> find(String stockDatabaseId) throws SQLException;
	void deleteAll(String stockDatabaseId) throws SQLException;
}