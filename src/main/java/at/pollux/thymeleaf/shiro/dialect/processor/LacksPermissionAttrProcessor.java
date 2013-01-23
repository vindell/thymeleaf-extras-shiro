/*****************************************************************************
 * Copyright (c) 2013, theborakompanioni (http://www.example.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ****************************************************************************/
package at.pollux.thymeleaf.shiro.dialect.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IProcessor;

public class LacksPermissionAttrProcessor extends HasPermissionAttrProcessor {

	private static final String ATTRIBUTE_NAME = "lacksPermission";
	
	public static IProcessor create() {
		return new LacksPermissionAttrProcessor();
	}
    
    public LacksPermissionAttrProcessor() {
        super(ATTRIBUTE_NAME);
    }
    
    public LacksPermissionAttrProcessor(final String attrName) {
        super(attrName);
    }
    
    @Override
    protected boolean isVisible(final Arguments arguments, final Element element, final String attributeName) {
    	return !super.isVisible(arguments, element, attributeName);
    }    
}