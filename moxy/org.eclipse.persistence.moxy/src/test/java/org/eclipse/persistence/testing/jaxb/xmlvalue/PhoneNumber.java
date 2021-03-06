/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
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
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.jaxb.xmlvalue;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="phone")
@XmlType(name="phone-number")
public class PhoneNumber {

    @XmlTransient
    public String someTransientThing;

    @XmlValue
    public String number;

    public boolean equals(Object o) {
        if(!(o instanceof PhoneNumber) || o == null) {
            return false;
        } else {
            return ((PhoneNumber)o).number.equals(this.number);
        }
    }

    public String toString() {
        return "EMPLOYEE(" + number + ")";
    }
}
