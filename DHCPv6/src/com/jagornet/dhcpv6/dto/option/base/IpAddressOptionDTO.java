/*
 * Copyright 2009 Jagornet Technologies, LLC.  All Rights Reserved.
 *
 * This software is the proprietary information of Jagornet Technologies, LLC. 
 * Use is subject to license terms.
 *
 */

/*
 *   This file IpAddressOptionDTO.java is part of DHCPv6.
 *
 *   DHCPv6 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   DHCPv6 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with DHCPv6.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.jagornet.dhcpv6.dto.option.base;

/**
 * The abstract Class IpAddressOptionDTO.
 * 
 * @author A. Gregory Rabil
 */
public abstract class IpAddressOptionDTO extends BaseOptionDTO
{   
    /** The ip address. */
    protected String ipAddress;

    /**
     * Gets the ip address.
     * 
     * @return the ip address 
     */
    public String getIpAddress()
    {
        return ipAddress;
    }

    /**
     * Sets the ip address.
     * 
     * @param ipAddress the new ip address 
     */
    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }
}