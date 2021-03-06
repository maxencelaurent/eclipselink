/*
 * Copyright (c) 2013, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Guy Pelletier, Doug Clarke - initial API and implementation
package org.eclipse.persistence.internal.jpa.config.persistenceunit;

import org.eclipse.persistence.jpa.config.DataService;

/**
 * JPA scripting API implementation.
 *
 * @author Guy Pelletier
 * @since EclipseLink 2.5.1
 */
public class DataServiceImpl implements DataService {

    private PersistenceUnitImpl unit;

    public DataServiceImpl(PersistenceUnitImpl unit) {
        this.unit = unit;
    }

    /* (non-Javadoc)
     * @see com.oracle.toplink.jpa.scripting.impl.DataService#getUnit()
     */
    @Override
    public PersistenceUnitImpl getUnit() {
        return this.unit;
    }

    /* (non-Javadoc)
     * @see com.oracle.toplink.jpa.scripting.impl.DataService#getName()
     */
    @Override
    public String getName() {
        return getUnit().getPersistenceUnitInfo().getPersistenceUnitName();
    }

}
