/*
 Copyright  2007 MySQL AB, 2008 Sun Microsystems
 All rights reserved. Use is subject to license terms.

  The MySQL Connector/J is licensed under the terms of the GPL,
  like most MySQL Connectors. There are special exceptions to the
  terms and conditions of the GPL as it is applied to this software,
  see the FLOSS License Exception available on mysql.com.

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License as
  published by the Free Software Foundation; version 2 of the
  License.

  This program is distributed in the hope that it will be useful,  
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  02110-1301 USA
 
 */

package com.mysql.jdbc;

import java.sql.ResultSetMetaData;
import java.util.Map;

public class CachedResultSetMetaData {
		/** Map column names (and all of their permutations) to column indices */
		Map columnNameToIndex = null;

		/** Cached Field info */
		Field[] fields;

		/** Map of fully-specified column names to column indices */
		Map fullColumnNameToIndex = null;

		/** Cached ResultSetMetaData */
		java.sql.ResultSetMetaData metadata;

		public Map getColumnNameToIndex() {
			return columnNameToIndex;
		}

		public Field[] getFields() {
			return fields;
		}

		public Map getFullColumnNameToIndex() {
			return fullColumnNameToIndex;
		}

		public java.sql.ResultSetMetaData getMetadata() {
			return metadata;
		}
	}