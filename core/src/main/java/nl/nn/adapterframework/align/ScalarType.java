/*
   Copyright 2021 WeAreFrank!

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package nl.nn.adapterframework.align;

import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.xs.XSConstants;

public enum ScalarType {
	UNKNOWN,NUMERIC,BOOLEAN,STRING;

	public static ScalarType findType(XSSimpleType simpleType) {
		if (simpleType==null) {
			return UNKNOWN;
		}
		if (simpleType.getNumeric()) {
			return NUMERIC;
		}
		if (simpleType.getBuiltInKind()==XSConstants.BOOLEAN_DT) {
			return BOOLEAN;
		}
		return STRING;
	}
}
